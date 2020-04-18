package com.it.aspect;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Aspect
@Component
public class SysLogAspect {

    private long startTime;

    private long endTime;

    private static final Logger LOGGER = LoggerFactory.getLogger(SysLogAspect.class);

    private static final int PARAM_MAX_LENGTH = 1000;

    @Before("execution(* jp.co.xq.controller..*.*(..))")
    public void before(JoinPoint joinPoint) {
        LOGGER.debug("before");
        startTime = System.currentTimeMillis();
    }

    @After("execution(* jp.co.xq.controller..*.*(..))")
    public void after(JoinPoint joinPoint) {
        LOGGER.debug("after");
    }

    // 共通処理
    @Around("execution(* jp.co.xq.controller..*.*(..))")
    public Object around(ProceedingJoinPoint pjp) {
        LOGGER.debug("around");
        MethodSignature signature = (MethodSignature) pjp.getSignature();
        return "";
    }

}
