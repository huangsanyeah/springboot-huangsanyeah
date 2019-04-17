package com.wonders.service;

import com.wonders.entity.UserInfo;
import com.wonders.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author huangwieyue
 * @date 2018-02-13 11:52
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    @Cacheable(key = "#uid.toString()", value = "userInfo")
    public UserInfo getUser(Long uid) {
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(uid);
        System.out.println("service启用了redis注解缓存，第二次查询不会打印此句话");
        return userInfo;
    }

    @Override
    public void useTemplateCache() {
        //TODO 缓存中文乱码
        //stringRedisTemplate.opsForValue().set("2","redisTemplateValue");
        stringRedisTemplate.opsForValue().set("2", "redisTemplateValue", 60 * 20, TimeUnit.SECONDS);
    }
}
