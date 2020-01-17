package com.it.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * ユーザー登録処理
 *
 * @author tian
 */
@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Api(value = "user")
public class LoginController {

    /**
     * ユーザー名とパスワードで認証登録
     *
     * @param username ユーザー名
     * @param password パスワード
     * @return ログイン結果
     */
    @ResponseBody
    @ApiOperation(value = "ユーザーログイン処理", httpMethod = "POST")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Object login(@ApiParam(value = "ユーザー名") String username, @ApiParam(value = "パスワード") String password) {
        if ("admin".equals(username) && "admin".equals(password)) {
            return "ok";
        }

        return "ng";
    }


    /**
     * ログアウト処理
     *
     * @return 処理結果
     */
    @ResponseBody
    @ApiOperation(value = "ユーザーログアウト処理", httpMethod = "GET")
    @RequestMapping(value = "/logout", method = {RequestMethod.GET})
    public Object logout() {

        return "logout";
    }

}
