package com.imooc.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component//把本配置放入到 SpringBoot 容器中，使其被扫描到
@ConfigurationProperties(prefix = "user")
@PropertySource(value= "classpath:application.properties", encoding = "utf-8")
public class MyConfig {
    //成员变量
    public String username;
    public Integer age;
    public String sex;

    //getter、setter方法
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    //构造方法
    public MyConfig() {
    }
    public MyConfig(String userName, Integer age, String sex) {
        this.username = userName;
        this.age = age;
        this.sex = sex;
    }
}

/*<bean id="stu">
      <property name="name" value="jack"/>
      <property name="age" value="18"/>
  </bean>*/
