package com.imooc.job_backend.vo;

import lombok.Data;

@Data
public class JobsByCategoryVo {
    //成员变量
    private String categoryName;//岗位名称
    private String categoryDesc;//岗位描述
    private Integer quantity;//岗位数量
}
