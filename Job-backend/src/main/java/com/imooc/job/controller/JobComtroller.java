package com.imooc.job.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.imooc.job.domain.Jobs;
import com.imooc.job.service.JobsService;
import com.imooc.job.utils.ReponseResult;
import com.imooc.job.vo.JobsByCategoryVo;
import com.imooc.job.vo.JobsByCityVo;
import com.imooc.job.vo.JobsByProvinceVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/job")
@Slf4j//自动在类中生成一个名为log的日志对象
@Api(tags="岗位管理相关接口")//对Controller类进行分组和描述
public class JobComtroller {
    //成员变量
    //上层依赖下层，controller层调用service层的方法
    @Resource
    private JobsService jobsService;

    //成员方法
    //查询单条岗位数据
    @GetMapping("/v1/{id}")//定义get请求映射
    @ApiOperation("根据id获取岗位数据")//描述单个接口方法的作用
    public ReponseResult getById(@PathVariable("id") Integer id) {//获取路径参数,根据id获取岗位数据
        Jobs byId = jobsService.getById(id);//根据主键id查询单条数据记录
        if (byId != null) {
            return new ReponseResult(byId);
        } else {
            return new ReponseResult(401,"不存在对应id的数据");
        }
    }

    //分页查询岗位数据
    @GetMapping("/v1/page/{page}")
    @ApiOperation("分页查询岗位数据")//描述单个接口方法的作用
    public ReponseResult getByPage(@PathVariable("page") Integer page) {
        Integer pagesize = 20;
        IPage<Jobs> jobsByPage = jobsService.getJobsByPage(page,pagesize);
        log.info("总行数：{}",jobsByPage.getTotal());
        log.info("总页数：{}",jobsByPage.getPages());
        log.info("当前页：{}",jobsByPage.getCurrent());
        return new ReponseResult(jobsByPage);
    }

    //按类别统计岗位
    @GetMapping("/v1/category/statistics")
    @ApiOperation("按类别统计岗位")//描述单个接口方法的作用
    public ReponseResult getByCategory() {
        List<JobsByCategoryVo> jobsByCategoryVos = jobsService.countByCategoryName();
        return new ReponseResult(jobsByCategoryVos);
    }

    //按城市统计岗位
    @GetMapping("/v1/city/statistics")
    @ApiOperation("按地域统计岗位")
    public ReponseResult getByCity() {
        List<JobsByCityVo> jobsByCityVos = jobsService.countByCity();
        return new ReponseResult(jobsByCityVos);
    }

    //按省份统计岗位
    @GetMapping("/v1/province/statistics")
    @ApiOperation("按省份统计岗位")
    public ReponseResult getByProvince() {
        List<JobsByProvinceVo> jobsByProvinceVos = jobsService.countByProvince();
        return new ReponseResult(jobsByProvinceVos);
    }
}
