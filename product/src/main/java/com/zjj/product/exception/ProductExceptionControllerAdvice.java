package com.zjj.product.exception;

import com.zjj.mymallcommon.response.CodeEnum;
import com.zjj.mymallcommon.response.ServerResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;

/**
 * @author zhangjiajun
 * @date 2022/11/26 17:15
 * @description Product统一异常处理
 */
@Slf4j
@RestControllerAdvice(basePackages = "com.zjj.product.controller")
public class ProductExceptionControllerAdvice {
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ServerResponse handleVaildException(MethodArgumentNotValidException e){
      log.error("数据出现问题{},异常类型:{}",e.getMessage(),e.getClass());
        BindingResult bindingResult = e.getBindingResult();
        HashMap<String, String> errors = new HashMap<>();
        bindingResult.getFieldErrors().forEach((item)->{
            errors.put(item.getField(),item.getDefaultMessage());
        });
        return new ServerResponse(CodeEnum.VALID_PARAMETER_FAIL.getCode(), CodeEnum.VALID_PARAMETER_FAIL.getMessage(), errors);
    }
    //Exception太大了,很坑
    /*@ExceptionHandler(value = Exception.class)
    public ServerResponse handleException(Exception e){
        return new ServerResponse(BizCodeEnume.REQUEST_FAIL.getCode(), BizCodeEnume.REQUEST_FAIL.getMessage());
    }*/
}
