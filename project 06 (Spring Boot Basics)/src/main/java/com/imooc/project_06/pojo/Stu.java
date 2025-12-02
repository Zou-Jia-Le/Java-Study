package com.imooc.project_06.pojo;

public class Stu {
    //成员变量
    public String  name;
    public Integer age;

    //getter、setter方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    //构造方法
    public Stu() {
    }
    public Stu(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}

/*<bean id="stu">
      <property name="name" value="jack"/>
      <property name="age" value="18"/>
  </bean>*/
