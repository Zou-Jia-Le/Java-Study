package com.imooc.job_backend.service;

import com.imooc.job_backend.domain.JobCategory;
import com.imooc.job_backend.utils.ReponseResult;

//JobCategory服务接口
public interface JobCategoryService {
    //获取所有岗位类别
    ReponseResult getAllJobCategory();
    //新增岗位类别
    ReponseResult addJobCategory(JobCategory jobCategory);
    //删除岗位类别
    ReponseResult removeJobCategory(Integer id);
    //修改岗位类别
    ReponseResult updateJobCategory(JobCategory jobCategory);
}
