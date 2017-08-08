package com.liu.test.demo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 主页
 *
 * @author 刘慧芳
 * @create 2017-07-28 15:20
 **/
@RestController
@EnableAutoConfiguration
public class IndexController {
    public Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/")
    public String index(){

        return "ceshi";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(IndexController.class, args);
    }
}
