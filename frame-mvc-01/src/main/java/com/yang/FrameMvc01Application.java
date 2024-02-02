package com.yang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * @author LXY
 * @version 1.0
 * @description: 启动类
 * @date 2024/1/30 17:14
 */
@SpringBootApplication
@Configuration
public class FrameMvc01Application {

    public static void main(String[] args) {
        SpringApplication.run(FrameMvc01Application.class, args);
    }

}
