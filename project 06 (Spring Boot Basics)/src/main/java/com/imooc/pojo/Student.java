package com.imooc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//生成 getter、setter、toString 方法
@NoArgsConstructor//生成无参构造函数
@AllArgsConstructor//生成全参构造函数
public class Student {
    //成员变量
    public String  name;
    public Integer age;
}

/*<bean id="stu">
      <property name="name" value="jack"/>
      <property name="age" value="18"/>
  </bean>*/
