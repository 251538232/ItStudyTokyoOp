package com.it.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author t
 */
@RestController
public class BaseViewController {

    @ResponseBody
    @RequestMapping("/test")
    public String test() throws Exception {
        Thread.sleep(3000);
        String result = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS"));
        System.out.println(result);
        return result;
    }

}
