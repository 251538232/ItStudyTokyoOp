package com.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * アプリケーション起動
 *
 * @author tian
 */
@ComponentScan("com.it")
@SpringBootApplication
@EnableScheduling
public class StudyApplication {


    public static void main(String[] args) {
        SpringApplication.run(StudyApplication.class, args);
    }

}
