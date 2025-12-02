package com.imooc.job_backend.mapper;

import com.imooc.job_backend.domain.Jobs;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.imooc.job_backend.vo.JobsByCategoryVo;
import com.imooc.job_backend.vo.JobsByCityVo;
import com.imooc.job_backend.vo.JobsByProvinceVo;
import java.util.List;

/**
* @author a1322
* @description 针对表【jobs(岗位详情表)】的数据库操作Mapper
* @createDate 2025-11-09 11:37:36
* @Entity com.imooc.job_backend.domain.Jobs
*/
public interface JobsMapper extends BaseMapper<Jobs> {
    //按类别统计岗位数量
    List<JobsByCategoryVo> countByCategoryName();
    //按城市统计岗位数量
    List<JobsByCityVo> countByCity();
    //按省份统计岗位数量
    List<JobsByProvinceVo> countByProvince();
}


