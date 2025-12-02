package com.imooc.project_06.utils.interceptor;

import com.imooc.project_06.utils.exception_handler.exception.MyCustomException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.util.StringUtils;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
//拦截器:给前端返回的是处理后的错误响应
public class UserInfoInterceptor implements HandlerInterceptor {
    //方法实现
    /**
     * 拦截请求，访问 controller 之前
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle (HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String userId = request.getHeader("userId");
        String userToken = request.getHeader("userToken");
        if (StringUtils.isEmpty(userId) || StringUtils.isEmpty(userToken)) {
            log.error("用户校验不通过，信息不完整");
            //拦截器捕获到"用户校验不通过，信息不完整"，利用 MyCustomException.display 抛出一个自定义异常对象，然后被 GraceExceptionHandler 进行异常处理
            MyCustomException.display("用户校验不通过，信息不完整");
            /**
             * false:请求被拦截
             * true：请求放行，可以访问后面的 controller
             */
            return false;
        }
        //假设真实的用户 id 是 1001，用户 token 是 abcxyz
        if (!userId.equalsIgnoreCase("1001") || !userToken.equalsIgnoreCase("abcxyz")) {
            log.error("用户权限不通过");
            MyCustomException.display("用户权限不通过");
            return false;
        }
        return true;
    }
    /**
     * 请求访问到 controller 之后，渲染试图之前
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle (HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }
    /**
     * 请求访问到 controller 之后，渲染试图之后
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion (HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
