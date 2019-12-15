package com.crazyang.service;

import org.springframework.stereotype.Component;

/**
 * @ClassName HelloServiceHystrix
 * @Description: TODO
 * @Author zhouyang
 * @Date 2019/12/14 下午11:46.
 */
@Component
public class HelloServiceHystrix implements HelloService{
    /**
     * 这里方法声明要与HelloService中的一致
     * @param name
     * @return
     */
    @Override
    public String hi(String name) {
        return " fall back. " + name;
    }
}
