package com.imooc.job_backend.vo;

import lombok.Data;

@Data
public class JobsByProvinceVo {
    //成员变量
    private String province;//省份名称
    private Integer quantity;//省份对应的岗位数量
}
