package com.imooc.job_backend.controller;

import com.imooc.job_backend.domain.JobCategory;
import com.imooc.job_backend.service.JobCategoryService;
import com.imooc.job_backend.utils.ReponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
@Api(tags="岗位类别相关接口")//对Controller类进行分组和描述
public class JobCategoryController {
    //上层依赖下层，controller层调用service层的方法
    @Resource
    private JobCategoryService jobCategoryService;

    @GetMapping("/all/category")
    @ApiOperation("获取所有的岗位类别")
    public ReponseResult getAllCategory() {
        return jobCategoryService.getAllJobCategory();
    }

    @PostMapping("add/category")
    @ApiOperation("添加岗位类别")
    public ReponseResult addCategory(@Validated JobCategory jobCategory) {//@Validated注解用来校验方法参数，具体的参数要求添加在实体类中
        return jobCategoryService.addJobCategory(jobCategory);
    }

    @PostMapping("/delete/category")
    @ApiOperation("删除岗位类别")
    public ReponseResult deleteCategory(@RequestParam(value = "id",required = true) Integer id) {
        return jobCategoryService.removeJobCategory(id);
    }

    @PostMapping("/update/category")
    @ApiOperation("修改岗位类别")
    public ReponseResult updateCategory(JobCategory jobCategory) {
        return jobCategoryService.updateJobCategory(jobCategory);
    }
}
