package com.it.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class TestController {

    @RequestMapping(value = "/")
    public String login(@ApiParam(value = "ユーザー名") String username,
                        @ApiParam(value = "パスワード") String password) {

        return "swagger-ui.html";
    }
}
