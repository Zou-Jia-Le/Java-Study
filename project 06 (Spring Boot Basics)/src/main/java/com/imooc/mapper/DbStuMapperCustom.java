package com.imooc.mapper;

import com.imooc.pojo.DbStu;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface DbStuMapperCustom {
    //抽象方法
    List<DbStu> getStuById(String sid);
}