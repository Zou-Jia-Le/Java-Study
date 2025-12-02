package com.imooc.project_06.controller;

import com.imooc.project_06.pojo.DbStu;
import com.imooc.project_06.pojo.bo.DbStuBO;
import com.imooc.project_06.service.StuService;
import com.imooc.project_06.utils.reponseresult.JSONResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@Slf4j//生成一个 log 对象
@RequestMapping("dbstu")//加一层路由，以 stu 开头
public class DBStuController {
    //成员变量
    @Autowired
    private StuService stuService;

    //成员方法
    //查询数据
    @GetMapping("/{stuId}/get")
    public String getStu(@PathVariable String stuId,//获取 url 中的路径参数
                         @RequestParam Integer id,//获取 url 中的请求参数，如果参数变量名保持一致，该注解可以省略
                         @RequestParam String name) {//获取 url 中的请求参数，如果参数变量名保持一致，该注解可以省略
        log.info("stuId = " +  stuId);
        log.info("id = " + id);
        log.info("name = " +  name);
        return "查询Stu";
    }

    //查询数据
    @GetMapping("/get")
    //前端直接在域名后输入的参数默认都是 String 类型
    public JSONResult getStu1(String stuId) {
        //根据主键查询数据
            DbStu stu1 = stuService.queryById(stuId);
            //return JSONResult.ok(stu1);
        //根据条件查询数据
            List<DbStu> list1 = stuService.queryByCondition1("abc",1);
            //return JSONResult.ok(list1);
            List<DbStu> list2 = stuService.queryByCondition2("abc",1);
            //return JSONResult.ok(list2);
        //自定义根据主键查询数据
            DbStu stu2 = stuService.queryByIdCustom(stuId);
            return JSONResult.ok(stu2);
    }

    //获取字段验证错误信息
    public Map<String,String> getErrors(BindingResult result) {
        Map<String,String> map = new HashMap<>();
        List<FieldError> errorList = result.getFieldErrors();
        for (FieldError error:errorList) {
            String field = error.getField();
            String msg = error.getDefaultMessage();
            map.put(field,msg);
        }
        return map;
    }

    //新增数据
    @PostMapping("/create1")
    public JSONResult createStu1() {
        String sid = UUID.randomUUID().toString();
        DbStu stu = new DbStu();
        stu.setId(sid);
        stu.setName("慕课网");
        stu.setSex(1);
        stuService.saveStu(stu);
        return JSONResult.ok();
    }

    //新增数据
    @PostMapping("/create2")
    public JSONResult createStu2 (@Valid @RequestBody DbStuBO stuBO,
                                 BindingResult result) {//BindingResult：自动收集 @Valid 注解触发的验证错误
        //判断 BindingResult 是否包含验证错误
        if (result.hasErrors()) {
            Map<String,String> map = getErrors(result);//处理返回的错误信息
            return JSONResult.errorMap(map);
        }
        String sid = UUID.randomUUID().toString();//生成 UUID 作为主键
        DbStu stu = new DbStu();
        BeanUtils.copyProperties(stuBO,stu);//属性拷贝
        stu.setId(sid);
        stuService.saveStu(stu);
        return JSONResult.ok();
    }

    //修改数据
    //@PutMapping("/update")
    @GetMapping("/update")
    public JSONResult updateStu() {
        DbStu stu = new DbStu();
        stu.setId("1111");
        stu.setName("已经修改的name");
        stu.setSex(2);
        stuService.updateStu(stu);
        return JSONResult.ok();
    }

    //删除数据
    //@DeleteMapping("/delete")
    @GetMapping("/delete")
    public String deleteStu() {
        DbStu stu = new DbStu();
        //stu.setId("12345");
        //stu.setSex(2);
        stu.setName("abc");
        stuService.deleteStu(stu);
        return "删除Stu";
    }

    //事务回滚测试
    @GetMapping("testTrans")
    public JSONResult testTrans() {
        stuService.testTrans();
        return JSONResult.ok();
    }
}
