package com.imooc.job.mapper;

import com.imooc.job.domain.JobCategory;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface JobCategoryMapper {
    //抽象方法
    //查询数据
    List<JobCategory> allJobCategory();
    //添加数据
    int insertJobCategory(JobCategory jobCategory);
    //删除数据
    int deleteByPrimaryKey(Integer id);
    //修改数据
    int updateByPrimaryKey(JobCategory jobCategory);
}
