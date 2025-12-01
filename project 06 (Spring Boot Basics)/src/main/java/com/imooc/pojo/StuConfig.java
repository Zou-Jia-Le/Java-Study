package com.imooc.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//为了说明当前类为配置类，加上这个注解以后，会被容器扫描到
/**
 * @Bean
 * @Controller
 * @Service
 * @Repository
 * @Componment
 * 这些组件注解也都能，根据场景以及类的业务去使用和定义即可
 */
public class StuConfig {
    @Bean//被它注解的方法将返回一个对象，这个对象应该被注册为 Spring 应用上下文中的一个 Bean
    public Stu stu() {
        return new Stu("jack",18);
    }
}
