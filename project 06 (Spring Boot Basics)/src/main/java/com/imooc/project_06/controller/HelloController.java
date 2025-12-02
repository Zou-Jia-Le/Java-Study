package com.imooc.project_06.controller;

import com.imooc.project_06.pojo.MyConfig;
import com.imooc.project_06.pojo.Stu;
import com.imooc.project_06.pojo.Student;
import com.imooc.project_06.utils.reponseresult.JSONResult;
import com.imooc.project_06.utils.task.MyAsyncTask;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;

@RestController
@Slf4j//生成一个 log 对象
public class HelloController {
    //成员方法
    @GetMapping("/hello")
    public String hello() {
        return "Hello IMOOC~~";
    }

    @Autowired//Spring 容器自动将一个依赖对象（Bean）“注入”到当前对象中
    private Stu stu;
    @GetMapping("/getStu")
    public Stu getStu() {
        return this.stu;
    }

    @Autowired//Spring 容器自动将一个依赖对象（Bean）“注入”到当前对象中
    private MyConfig myConfig;
    @GetMapping("/getMyConfig")
    public MyConfig getMyConfig() {
        return this.myConfig;
    }

    @Value("${self.custom.config.sdkSecret}")//提取配置文件属性
    private String sdkSecret;
    @Value("${self.custom.config.host}")//提取配置文件属性
    private String host;
    @Value("${app.name.xxx.yyy.zzz}")//提取配置文件属性
    private String xyz;
    @Value("${self.custom.config.port}")//提取配置文件属性
    private String port;
    @GetMapping("getYmlCustomConfig")//提取配置文件属性
    public String getYmlCustomConfig() {
        return sdkSecret + " " + host + ":" + port + " " + xyz;
    }

    @GetMapping("/getStudent")
    public JSONResult getStudent() {
        Student student1 = new Student();
        student1.setName("imooc");
        student1.setAge(18);
        //System.out.println(student1.toString());
        log.debug(student1.toString());
        //日志等级默认为info
        log.info(student1.toString());
        log.warn(student1.toString());
        log.error(student1.toString());

        Student student2 = new Student("我是吴彦祖",20);
        //return JSONResult.errorMsg("调用接口错误");
        return JSONResult.ok(student1);
    }

    //文件上传
    @PostMapping("/upload")
    public String upload(MultipartFile file) throws Exception {
        file.transferTo(new File("C:\\colasa\\Java project\\imooc-springboot-init\\uploads\\" + file.getOriginalFilename()));
        return "上传成功";
    }

    //异步任务的实现
    @Autowired
    private MyAsyncTask myAsyncTask;
    @GetMapping("/getMyAsyncTask")
    public Object getMyAsyncTask() {
        myAsyncTask.publishMsg();
        log.info("这是跳过异步任务的执行");
        return myConfig;
    }
}
