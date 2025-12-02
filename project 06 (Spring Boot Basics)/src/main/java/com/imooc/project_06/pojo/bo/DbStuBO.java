package com.imooc.project_06.pojo.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import javax.validation.constraints.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DbStuBO {
    //成员变量
    private String id;
    @NotBlank
    private String name;
    @NotNull
    private Integer sex;
    @Min(value = 1,message = "学生的年级最小为1年级")
    @Max(value = 6,message = "学生的年级最大为6年级")
    private Integer grade;
    @Range(min = 1,max = 18,message = "学生所在班级的区间为1~18")
    private Integer classroom;
    @Size(min = 2,max = 5,message = "学生的技能填写至少2个，最多5个")
    private List<String> skill;
    @Length(min = 3,max = 8,message = "学生的英文名长度区间为3~8")
    private String englishName;
    @Email(message = "邮箱格式不正确")
    private String email;
}