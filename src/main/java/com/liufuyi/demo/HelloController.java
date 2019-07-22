package com.liufuyi.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private StudentProperties studentProperties;


    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring Boot! ===>" + studentProperties.getName() + "==>" + studentProperties.getAge();
    }
}
