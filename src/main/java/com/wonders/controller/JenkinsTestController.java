package com.wonders.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangweiyue
 * @version v1.0
 * @task
 * @description 测试jenkins部署
 * @date Created in 2019-08-18
 * @modifiedBy
 */
@RestController
@RequestMapping("jenkins")
public class JenkinsTestController {
    @RequestMapping("/get")
    public String getString() {
        return "hello Jenkins";
    }
}
