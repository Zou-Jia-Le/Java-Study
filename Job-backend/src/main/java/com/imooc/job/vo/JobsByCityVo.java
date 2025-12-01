package com.imooc.job.vo;

import lombok.Data;

@Data
public class JobsByCityVo {
    //成员变量
    private String city;//城市名称
    private Integer quantity;//城市对应的岗位数量
}
