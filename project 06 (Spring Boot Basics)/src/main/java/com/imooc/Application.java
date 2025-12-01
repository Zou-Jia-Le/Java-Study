package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.mybatis.spring.annotation.MapperScan;//MyBatis官方提供的包
import tk.mybatis.spring.annotation.MapperScan;//不使用MyBatis官方提供的包，而是用tk.mybatis提供的@MapperScan注解

/**
 * 1、表明当前项目为 SpringBoot 工程，这是一个启动类，也是应用程序的入口类
 * 2、启动类需要放在根包路径之下（com。imooc），
 *    因为它会默认扫描 controller 和 service 以及 mapper 等一些相关的组件
 *    扫描完了之后，会放入到 Spring/SpringBoot 的容器中
 */
@SpringBootApplication
@MapperScan(basePackages = "com.imooc.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
