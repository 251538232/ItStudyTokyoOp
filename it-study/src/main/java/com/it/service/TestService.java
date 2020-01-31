package com.it.service;

import com.it.utils.HttpUtils;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Async
    public String testSend() throws Exception {
        String result = HttpUtils.sendGet("http://localhost:8088/test");
        System.out.println("2222222");
        return result;
    }
}
