package com.imooc.project_06.service;

import com.imooc.project_06.pojo.DbStu;
import java.util.List;

public interface StuService {
    //抽象方法
    /**
     * 新增 stu 到数据库
     * @param stu
     */
    public void saveStu(DbStu stu);
    /**
     * 根据主键查询对象信息
     * @param id
     */
    public DbStu queryById(String id);
    /**
     * 根据条件查询 stu 的 list 结果集
     * @param name
     * @param sex
     * @return
     */
    public List<DbStu> queryByCondition1(String name,Integer sex);
    /**
     * 根据条件查询 stu 的 list 结果集
     * @param name
     * @param sex
     * @return
     */
    public List<DbStu> queryByCondition2(String name,Integer sex);
    /**
     * 修改 stu 到数据库
     * @param stu
     */
    public void updateStu(DbStu stu);
    /**
     * 根据条件删除 stu
     * @param stu
     */
    public void deleteStu(DbStu stu);
    /**
     *用于演示事务
     */
    public void testTrans();
    /**
     * 自定义根据主键查询对象信息
     * @param id
     */
    public DbStu queryByIdCustom(String id);
}
