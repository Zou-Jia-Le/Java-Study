package com.imooc.job.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.imooc.job.domain.Jobs;
import com.baomidou.mybatisplus.extension.service.IService;
import com.imooc.job.vo.JobsByCategoryVo;
import com.imooc.job.vo.JobsByCityVo;
import com.imooc.job.vo.JobsByProvinceVo;

import java.util.List;

/**
* @author a1322
* @description 针对表【jobs(岗位详情表)】的数据库操作Service
* @createDate 2025-11-09 11:37:36
*/
public interface JobsService extends IService<Jobs> {
    //分页查询
    IPage<Jobs> getJobsByPage(int pageNum, int pageSize);//当前页码、每页数据条数

    //按类别统计岗位数量
    List<JobsByCategoryVo> countByCategoryName();

    //按城市统计岗位数量
    List<JobsByCityVo> countByCity();

    //按省份统计岗位数量
    List<JobsByProvinceVo> countByProvince();
}
