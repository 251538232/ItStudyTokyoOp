package com.it.controller;

import com.it.service.TestService;
import com.it.utils.HttpUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * ユーザー登録処理
 *
 * @author tian
 */
@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Api(value = "user")
public class LoginController {

    // 控制正转
    // new Xxxx();

    // 控制反转 nonew 直接取 ioc
    //     @Autowired
    //    TestService testService;
    // 面向切面编程 aop

    @Autowired
    TestService testService;

    /**
     * ユーザー名とパスワードで認証登録
     * RESTFUL （设计方式 设计风格）
     *
     * @param username ユーザー名
     * @param password パスワード
     * @return ログイン結果
     */
    @ResponseBody
    @ApiOperation(value = "ユーザーログイン処理", httpMethod = "POST")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Object login(@ApiParam(value = "ユーザー名") String username,
            @ApiParam(value = "パスワード") String password) throws Exception {
        boolean result = testLogin(username, password);
        if (result) {
            return "login ok";
        } else {
            return "login ng";
        }
    }

    private boolean testLogin(String username, String passwd) throws Exception {
        boolean result = false;
        Class.forName("org.sqlite.JDBC");
        // 建立连接
        Connection conn = DriverManager.getConnection("jdbc:sqlite:" + "C:\\Users\\qdmission\\IdeaProjects\\ItStudyTokyoOp\\doc\\test.db");
        // "select * from user"
        PreparedStatement state = conn.prepareStatement("select * from user");
        //查询数据
        ResultSet rs = state.executeQuery();
        while (rs.next()) {
            if (username.equals(rs.getString("USER_NAME"))
                    && passwd.equals(rs.getString("PASS_WD"))) {
                result = true;
                break;
            }
        }
        rs.close();
        state.close();
        conn.close();

        return result;
    }

    /**
     * M=包装传递
     * V=显示
     * C=控制
     * model  view    controller
     */
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

    /**
     * ログアウト処理
     *
     * @return 処理結果
     */
    @ResponseBody
    @RequestMapping(value = "/test", method = {RequestMethod.GET})
    public Object test() throws Exception {
        for (int i = 0; i < 3; i++) {
            Thread.sleep(10);
            testService.testSend();
        }
        String result = "ok too";
        return result;
    }


}
