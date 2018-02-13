package com.wonders.controller;

import com.wonders.entity.UserInfo;
import com.wonders.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangwieyue
 * @date 2018-02-13 11:48
 */
@RestController
@RequestMapping("springboot")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;
    @RequestMapping("/getUser")
    public UserInfo getUser(Long uid){
        return userInfoService.getUser(uid);
    }
}
