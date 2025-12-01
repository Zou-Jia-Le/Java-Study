package com.imooc.job;

//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
//@MapperScan("com.imooc.job.mapper")
@EnableOpenApi//启用SpringDoc OpenAPI文档
public class JobApplication {
    public static void main(String[] args) {
        //启动SpringBoot项目
        SpringApplication.run(JobApplication.class, args);
    }
}
