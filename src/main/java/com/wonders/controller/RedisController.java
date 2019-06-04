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

    /**
     * 使用keyGenerator生成缓存的key 注意需要配置key序列化为String
     * http://localhost:8099/redis/cacheUserByKeyGenerator?uid=4
     * @param uid
     * @return
     */
    @RequestMapping("/cacheUserByKeyGenerator")
    public UserInfo cacheUserByKeyGenerator(Long uid){
        return userInfoService.cacheUserByKeyGenerator(uid);
    }

    /**
     * cacheManager设置了默认redisTemplate的key缓存策略为Stirng 所以key不会乱码 value会  注释掉RedisConfig line 116 117那么key value就都乱码了
     * http://localhost:8099/redis/useRedisTemplateCache
     * @return
     */
    @RequestMapping("/useRedisTemplateCache")
    public String useRedisTemplate() {
        userInfoService.useRedisTemplateCache();
        return "使用【默认】RedisTemplate缓存";
    }

    /***
     * @description http://localhost:8099/redis/useStringRedisTemplateCache 使用restTemplate模板缓存  设置缓存时间
     * key value都是字符串明文显示的
     * @author huangweiyue
     * @date Created in 2019/4/17-19:49
     */
    @RequestMapping("/useStringRedisTemplateCache")
    public String useStringRedisTemplate() {
        userInfoService.useStringRedisTemplateCache();
        return "使用【默认】StringRedisTemplate缓存";
    }

    /***
     * @description http://localhost:8099/redis/useCustomObjectTemplateCache
     * 1 直接用原生模板缓存
     * 2 用自定义对象模板缓存
     * @author huangweiyue
     * @date Created in 2019/4/17-19:49
     */
    @RequestMapping("/useCustomObjectTemplateCache")
    public String useRedisTemplate1() {
        userInfoService.useCustomObjectTemplateCache();
        return "使用自定义对象CustomObjectTemplate来缓存";
    }

    /**
     * @description 使用自定义的String模板
     * http://localhost:8099/redis/useCustomStringTemplateCache
     * @return
     */
    @RequestMapping("/useCustomStringTemplateCache")
    public String useRedisTemplate2() {
        userInfoService.useCustomStringTemplateCache();
        return "使用自定义StringRedisTemplate来缓存";
    }
}
