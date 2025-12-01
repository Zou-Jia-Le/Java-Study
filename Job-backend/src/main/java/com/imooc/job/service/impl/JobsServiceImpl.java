package com.imooc.job.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.imooc.job.domain.Jobs;
import com.imooc.job.service.JobsService;
import com.imooc.job.mapper.JobsMapper;
import com.imooc.job.vo.JobsByCategoryVo;
import com.imooc.job.vo.JobsByCityVo;
import com.imooc.job.vo.JobsByProvinceVo;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
* @author a1322
* @description 针对表【jobs(岗位详情表)】的数据库操作Service实现
* @createDate 2025-11-09 11:37:36
*/
@Service
public class JobsServiceImpl extends ServiceImpl<JobsMapper,Jobs> implements JobsService {
    //成员变量
    //上层依赖下层，service层调用mapper层的方法
    @Resource
    private JobsMapper jobsMapper;

    //成员方法
    //分页查询
    public IPage<Jobs> getJobsByPage (int pageNum,int pageSize) {//当前页码、每页数据条数
        //创建分页对象
        Page<Jobs> page = new Page<>(pageNum,pageSize);
        //构造查询条件
        QueryWrapper<Jobs> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("id","job_title","category_name","salary","city","company","publish_time","company_info");//选择要查询的字段
        queryWrapper.orderByDesc("publish_time");//按publish_time的降序排序
        //执行分页查询
        Page<Jobs> jobsPage = jobsMapper.selectPage(page,queryWrapper);
        return jobsPage;
    }

    //按类别统计岗位数量
    @Override
    public List<JobsByCategoryVo> countByCategoryName() {
        List<JobsByCategoryVo> jobsByCategoryVos = jobsMapper.countByCategoryName();
        return jobsByCategoryVos;
    }

    //按城市统计岗位数量
    @Override
    public List<JobsByCityVo> countByCity() {
        List<JobsByCityVo> jobsByCityVos = jobsMapper.countByCity();
        return jobsByCityVos;
    }

    //按省份统计岗位数量
    @Override
    public List<JobsByProvinceVo> countByProvince() {
        List<JobsByProvinceVo> jobsByProvinceVos = jobsMapper.countByProvince();
        return jobsByProvinceVos;
    }
}




