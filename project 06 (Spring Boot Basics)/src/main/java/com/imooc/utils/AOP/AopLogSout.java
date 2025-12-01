package com.imooc.utils.AOP;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * AOP 日志输出切面类
 * 用于监控 Service 层方法的执行时间和性能
 */
@Aspect        // 声明这是一个 AOP 切面类，Spring AOP 会识别并处理这个类
@Slf4j         // Lombok 注解，自动生成日志对象 log，相当于 private static final Logger log = LoggerFactory.getLogger(AopLogSout.class);
@Component     // 声明为 Spring 组件，让 Spring 容器管理这个 Bean
public class AopLogSout {
    /**
     * AOP 的环绕通知 - 在目标方法执行前后进行拦截
     * 用于记录 Service 层方法的执行日志和执行时间
     *
     * AOP 的通知类型：
     * 1、前置通知 - @Before: 在目标方法执行前执行
     * 2、后置通知 - @AfterReturning: 在目标方法成功执行后执行
     * 3、环绕通知 - @Around: 在目标方法执行前后都执行（最强大的通知类型）
     * 4、异常通知 - @AfterThrowing: 在目标方法抛出异常后执行
     * 5、最终通知 - @After: 在目标方法执行后执行（无论是否成功）
     *
     * @param joinPoint 连接点对象，包含被拦截方法的详细信息
     * @return 目标方法的执行结果
     * @throws Throwable 目标方法可能抛出的异常
     */
    @Around("execution(* com.imooc.service.Impl..*.*(..))")//声明这是一个环绕通知
    /*切点表达式说明：
        execution(* com.imooc.service.Impl..*.*(..))
        * : 任意返回类型
        com.imooc.service.Impl : 指定包路径
        .. : 匹配当前包及其子包
        * : 任意类
        .* : 任意方法
        (..) : 任意参数
      整体含义：拦截 com.imooc.service.Impl 包及其子包下所有类的所有方法*/
    public Object printLogTimesofService(ProceedingJoinPoint joinPoint) throws Throwable {
        // 记录方法开始执行日志
        log.info("正在执行{}.{}",
                joinPoint.getTarget().getClass(),//joinPoint.getTarget().getClass(): 获取目标对象的 Class 信息（实际执行的 Service 对象）
                joinPoint.getSignature().getName());//joinPoint.getSignature().getName(): 获取被拦截方法的名称

        long startTime = System.currentTimeMillis();//记录方法开始执行的时间戳（毫秒）
        // 执行目标方法（这是实际业务逻辑的执行点）
        Object result = joinPoint.proceed();//proceed()方法会调用被拦截的原始方法
        long endTime = System.currentTimeMillis();//记录方法执行结束的时间戳（毫秒）
        long exTimes = endTime - startTime;//计算方法总执行时间（毫秒）

        if (exTimes > 3000) {//根据执行时间长度，输出不同级别的日志
            log.error("当前执行耗时：{}", exTimes);//执行时间超过 3 秒，记录错误级别日志（可能需要优化）
        } else if (exTimes > 2000) {
            log.warn("当前执行耗时：{}", exTimes);//执行时间在 2-3秒 之间，记录警告级别日志（需要关注）
        } else {
            log.info("当前执行耗时：{}", exTimes);//执行时间在 2 秒以内，记录信息级别日志（正常范围）
        }

        return result;//返回目标方法的执行结果，确保业务逻辑的正常流程
    }
}