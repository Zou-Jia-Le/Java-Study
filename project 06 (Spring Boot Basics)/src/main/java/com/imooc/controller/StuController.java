package com.imooc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

@RestController
@Slf4j//生成一个 log 对象
//加一层路由，以 stu 开头
@RequestMapping("stu")
public class StuController {
    //成员方法
    @GetMapping("/{stuId}/get")
    public String getStu (@PathVariable String stuId,//获取 url 中的路径参数
                         @RequestParam Integer id,//获取 url 中的请求参数，如果参数变量名保持一致，该注解可以省略
                         @RequestParam String name) {//获取 url 中的请求参数，如果参数变量名保持一致，该注解可以省略
        log.info("stuId = " +  stuId);
        log.info("id = " + id);
        log.info("name = " +  name);
        return "查询Stu";
    }

    @PostMapping("/create")
    public String createStu (@RequestBody HashMap<String,Object> map,//获取 Body 中的 Bean、Map 型参数
                            @RequestHeader("token") String token1,//获取 Header 中的 token 参数
                            HttpServletRequest request,
                            @CookieValue("clientId") String clientId) {//获取 cookie 中的 clientId 参数
        log.info("map = " +  map.toString());
        log.info("token1 = " +  token1);
        String token2 = request.getHeader("token");//获取 Body 中的 token 参数
        log.info("token2 = " +  token2);
        log.info("client = " + clientId);
        return "新增Stu";
    }

    @PutMapping("/update")
    public String updateStu() {
        return "修改Stu";
    }

    @DeleteMapping("/delete")
    public String deleteStu() {
        return "删除Stu";
    }
}
