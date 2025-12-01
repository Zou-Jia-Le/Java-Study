package com.imooc.utils.interceptor_config;

import com.imooc.utils.interceptor.UserInfoInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
//注册拦截器
public class InterceptorConfig implements WebMvcConfigurer {
    //成员方法
    @Bean
    public UserInfoInterceptor userInfoInterceptor() {
        return new UserInfoInterceptor();
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(userInfoInterceptor())
                //拦截规则
                .addPathPatterns("/upload");
    }
}
