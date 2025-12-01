package com.imooc.utils.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;

@Configuration//1、标记配置类，使得 SpringBoot 容器可以扫描到
@EnableAsync//2、开启异步任务
@Slf4j
//定时任务的实现
public class MyAsyncTask {
    //成员方法
    @Async
    public void publishMsg() {
        try {
            Thread.sleep(5000);
            log.warn("异步任务处理完毕：");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
