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
public class RedisController {
    @Autowired
    private UserInfoService userInfoService;

    /***
     * @description http://localhost:8099/redis/getUser?uid=3 使用注解缓存 需要配置CacheManager（两种方式：配置文件或者java类）
     * 失效时间等也是在CacheManager中配置
     * @author huangweiyue
     * @date Created in 2019/4/17-19:46
     */
    @RequestMapping("/getUser")
    public UserInfo getUser(Long uid){
        return userInfoService.getUser(uid);
    }

    /***
     * @description http://localhost:8099/redis/useRedisTemplate 使用restTemplate模板缓存
     * @author huangweiyue
     * @date Created in 2019/4/17-19:49
     */
    @RequestMapping("/useRedisTemplate")
    public String useRedisTemplate(Long uid) {
        userInfoService.useTemplateCache();
        return "使用RedisTemplate缓存";
    }
}
