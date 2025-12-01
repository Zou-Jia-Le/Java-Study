package com.imooc.job.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller//标识该类为控制器组件
@RestController//Controller和ResponseBody的组合
@ConfigurationProperties(prefix = "manager"/*指定前缀，配置文件中的key作为前缀*/)//将 application.properties 或 application.yml 中的配置属性映射到 Java 对象（配置属性和对象的名称必须相同，而且要为对象配置setter方法）
public class DemoController {
    //成员变量
    private String name;
    private String hobby;

    //setter方法
    public void setName(String name) {
        this.name = name;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    //成员方法
    @GetMapping("/get/userinfo")//处理get请求
    //@ResponseBody//将方法的返回值作为响应体返回给用户
    public String getUserinfo (
            @RequestParam(value = "nickname",required = true) String nickname,
            @RequestParam(value = "age",required = true) String age) {//获取请求参数
        return "昵称：" + nickname;
    }

    @PostMapping("/login")//处理post请求
    //@ResponseBody
    public String login() {
        return "login success";
    }

    @GetMapping("/get/propvalue")
    //@ResponseBody
    public void getPropertiesValues(@Value("${server.port}")String port) {//读取配置文件属性值
        System.out.println("port is:" + port);
        System.out.println(name + ":" + hobby);
    }
}
