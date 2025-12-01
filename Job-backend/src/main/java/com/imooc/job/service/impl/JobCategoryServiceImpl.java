package com.imooc.job.service.impl;

import com.imooc.job.domain.JobCategory;
import com.imooc.job.mapper.JobCategoryMapper;
import com.imooc.job.service.JobCategoryService;
import com.imooc.job.utils.ReponseResult;
import com.imooc.job.utils.enums.ResultCodeEnum;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class JobCategoryServiceImpl implements JobCategoryService {
    //上层依赖下层，service层调用mapper层的方法
    @Resource
    private JobCategoryMapper jobCategoryMapper;

    //方法实现
    //查询所有岗位类别
    @Override
    public ReponseResult getAllJobCategory() {
        return new ReponseResult(jobCategoryMapper.allJobCategory());
    }

    //新增岗位类别
    @Override
    public ReponseResult addJobCategory(JobCategory jobCategory) {
        int result = jobCategoryMapper.insertJobCategory(jobCategory);
        Map<String,Integer> idMap = new HashMap<>();
        if (result > 0) {
            //result = jobCategory.getId();//如果插入成功，返回自增主键id
            idMap.put("id",jobCategory.getId());
            return new ReponseResult(idMap);
        }
        return new ReponseResult(ResultCodeEnum.SERVER_ERROR);
    }

    //删除岗位类别
    @Override
    public ReponseResult removeJobCategory(Integer id) {
        int result = jobCategoryMapper.deleteByPrimaryKey(id);
        if (result > 0) {
            return new ReponseResult();
        }
        return new ReponseResult(ResultCodeEnum.DB_ERROR);
    }

    //修改岗位类别
    @Override
    public ReponseResult updateJobCategory(JobCategory jobCategory) {
        int result = jobCategoryMapper.updateByPrimaryKey(jobCategory);
        if (result > 0) {
            return new ReponseResult();
        }
        return new ReponseResult(ResultCodeEnum.DB_ERROR);
    }
}
