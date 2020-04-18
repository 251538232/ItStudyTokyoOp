package com.it.service;

import com.it.utils.HttpUtils;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class TestService {

    @Async
    public String testSend() throws Exception {
        String result = HttpUtils.sendGet("http://localhost:8088/test");
        System.out.println("2222222");
        return result;
    }

    public String multi(int count) {
        // i left j right = xxx
        int result = 0;
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= i; j++) {
                result = i * j;
            }
        }
        // 81 81/2 [40]
        return String.valueOf(result);
    }
}
