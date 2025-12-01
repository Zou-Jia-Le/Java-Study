package com.imooc.job.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.NotBlank;

@Data//生成getter、setter、toString等方法
@NoArgsConstructor//生成无参构造方法
@AllArgsConstructor//生成全参构造方法
public class JobCategory {
    //成员变量
    private int id;
    @NotBlank(message = "岗位类别名称不允许为空")//参数不允许为空
    @Length(min = 2,max = 20,message = "长度为2~20个字符")//参数长度限制
    //MyBatisPlus查询数据的时候会默认使用驼峰命名法
    private String categoryName;
    private String categoryDesc;
}
