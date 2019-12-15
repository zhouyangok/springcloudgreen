package com.crazyang.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description: TODO
 * @Author zhouyang
 * @Date 2019/12/14 下午8:00.
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/provider")
    public String hi(String name) {
        return String.format("hello %s , from port=%s", name, port);
    }
}
