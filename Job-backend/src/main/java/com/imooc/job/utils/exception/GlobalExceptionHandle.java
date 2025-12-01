package com.imooc.job.utils.exception;

import com.imooc.job.utils.ReponseResult;
import com.imooc.job.utils.enums.ResultCodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//全局统一异常处理
@RestControllerAdvice//开启全局的异常捕获
@Slf4j//自动在类中生成一个名为log的日志对象（依赖lombok）
public class GlobalExceptionHandle {
    //静态变量
    //private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandle.class);//LoggerFactory创建日志对象

    //成员方法
    //参数校验异常处理，捕获处理BindException类异常
    @ExceptionHandler(BindException.class)
    public ReponseResult bindExceptionHandler(BindException e) {
        BindingResult bindingResult = e.getBindingResult();//从异常对象中拿到BindingResult对象
        StringBuilder strBuilder = new StringBuilder("校验失败：");//存储msg信息
        //遍历bindingResult关联字段的所有error
        for (FieldError fieldError : bindingResult.getFieldErrors()) {
            strBuilder
                    .append(fieldError.getField())
                    .append(": ")
                    .append(fieldError.getDefaultMessage())
                    .append(",");
        }
        String msg = strBuilder.toString();
        log.error(ResultCodeEnum.PARAM_ERROR.getCode() + msg);//输出日志
        return new ReponseResult(ResultCodeEnum.PARAM_ERROR.getCode(),msg);
    }

    //唯一键异常处理，捕获处理DuplicateKeyException类异常
    @ExceptionHandler(DuplicateKeyException.class)
    public ReponseResult duplicateKeyEcxeptionHandler(DuplicateKeyException e) {
        log.error(e.getMessage());//输出日志
        return new ReponseResult(ResultCodeEnum.UNIQUE_KEY_ERROR.getCode(),e.getCause().getMessage());
    }

    //未知异常处理
    @ExceptionHandler(Exception.class)
    public ReponseResult unkonownExceptionHandler(Exception e) {
        log.error(e.getMessage());//输出日志
        return new ReponseResult(ResultCodeEnum.UNKNOWN_ERROR.getCode(),e.getMessage());
    }
}
