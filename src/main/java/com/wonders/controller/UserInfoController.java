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
@RequestMapping("redis")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    /**
     * http://localhost:8099/redis/getUser?uid=3
     *
     * @param uid
     * @return
     */
    @RequestMapping("/getUser")
    public UserInfo getUser(Long uid){
        return userInfoService.getUser(uid);
    }

    /**
     * http://localhost:8099/redis/useRedisTemplate
     *
     * @param uid
     * @return
     */
    @RequestMapping("/useRedisTemplate")
    public String useRedisTemplate(Long uid) {
        userInfoService.useTemplateCache();
        return "使用RedisTemplate缓存";
    }
}
