package com.imooc.project_06.service.Impl;

import com.imooc.project_06.mapper.DbStuMapper;
import com.imooc.project_06.mapper.DbStuMapperCustom;
import com.imooc.project_06.pojo.DbStu;
import com.imooc.project_06.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;
import java.util.List;
import java.util.UUID;

@Service
public class StuServiceImpl implements StuService {
    //成员变量
    @Autowired
    private DbStuMapper dbStuMapper;
    @Autowired
    private DbStuMapperCustom dbStuMapperCustom;

    //方法实现
    //插入数据
    @Override
    public void saveStu(DbStu stu) {
        dbStuMapper.insert(stu);
    }

    //根据主键 id 查询数据
    @Override
    public DbStu queryById(String id) {
        DbStu stu = dbStuMapper.selectByPrimaryKey(id);
        return stu;
    }

    //根据条件查询数据
    /**
     * 根据姓名和性别查询学生列表
     * @param name 姓名（精确匹配）
     * @param sex 性别（精确匹配）
     * @return 符合条件的学生列表
     */
    public List<DbStu> queryByCondition1 (String name, Integer sex) {
        //创建 Example 对象，指定要查询的实体类
        Example example = new Example(DbStu.class);
        //创建查询条件
        Example.Criteria criteria = example.createCriteria();
        //添加姓名条件（精确匹配）
        criteria.andEqualTo("name", name);
        //添加性别条件（精确匹配）
        criteria.andEqualTo("sex", sex);
        //执行查询
        List<DbStu> list = dbStuMapper.selectByExample(example);
        return list;
    }

    //根据条件查询数据
    /**
     * 根据姓名和性别查询学生列表
     * @param name 姓名（精确匹配）
     * @param sex 性别（精确匹配）
     * @return 符合条件的学生列表
     */
    public List<DbStu> queryByCondition2 (String name, Integer sex) {
        //条件对象
        DbStu stu = new DbStu();
        stu.setName(name);
        stu.setSex(sex);
        //执行查询
        List<DbStu> list = dbStuMapper.select(stu);
        return list;
    }

    //根据主键修改数据
    @Override
    public void updateStu(DbStu stu) {
        dbStuMapper.updateByPrimaryKey(stu);
    }

    //根据条件删除 stu
    @Override
    public void deleteStu(DbStu stu) {
        //1、根据主键删除
        //dbStuMapper.deleteByPrimaryKey(stu.getId());
        //2、根据对象中的属性值匹配做条件删除
        //dbStuMapper.delete(stu);
        //3、根据构建的 example 进行条件的删除
        //创建 Example 对象，指定要查询的实体类
        Example example = new Example(DbStu.class);
        //创建查询条件
        Example.Criteria criteria = example.createCriteria();
        //添加姓名条件（精确匹配）
        criteria.andEqualTo("name", stu.getName());
        //执行删除
        dbStuMapper.deleteByExample(example);
    }

    //事务的回滚演示
    @Override
    @Transactional(propagation = Propagation.REQUIRED)//Spring 事务注解，REQUIRED 是 Spring 事务的默认传播行为。它的核心逻辑是：“如果当前没有事务，就创建一个新事务；如果当前已经存在事务，就加入这个事务。”
    public void testTrans() {
        //1、新增数据
        //2、修改/删除数据
        //3、模拟法伤异常
        //4、观察1和2步骤所发生的数据变动，有没有影响到数据库
        //5、处理事务，实现事务的回滚，不让先前的数据入库
        String sid = UUID.randomUUID().toString();
        DbStu stu = new DbStu();
        stu.setId(sid);
        stu.setName(sid);
        stu.setSex(2);
        dbStuMapper.insert(stu);

        //发生异常
        int a = 100 / 0;

        //发生异常后下面的代码不执行
        DbStu stuUpdate = new DbStu();
        stuUpdate.setId("1234");
        stu.setName("1001修改");
        stu.setSex(3);
        dbStuMapper.updateByPrimaryKeySelective(stuUpdate);
    }

    //根据主键 id 查询数据
    @Override
    public DbStu queryByIdCustom(String id) {
        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();//打印异常的堆栈跟踪信息
        }
        List<DbStu> list = dbStuMapperCustom.getStuById(id);
        if (list != null && !list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }
}
