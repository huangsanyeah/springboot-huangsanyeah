package com.wonders.service.impl;

import com.wonders.entity.UserInfo;
import com.wonders.mapper.UserInfoMapper;
import com.wonders.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    @Cacheable(key = "#uid.toString()", value = "userInfo1")
    public UserInfo getUser(Long uid) {
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(uid);
        System.out.println("service启用了redis注解缓存，第二次查询不会打印此句话");
        return userInfo;
    }

    @Override
    @Cacheable(value = "userInfo2",keyGenerator = "customKeyGenerator")
    public UserInfo cacheUserByKeyGenerator(Long uid) {
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(uid);
        System.out.println("service启用了redis注解缓存，第二次查询不会打印此句话");
        return userInfo;
    }

    @Override
    public void useRedisTemplateCache() {
        redisTemplate.opsForValue().set("key1","111");
    }

    @Override
    public void useStringRedisTemplateCache() {
        stringRedisTemplate.opsForValue().set("key2", "222", 60 * 20, TimeUnit.SECONDS);
    }

    //TODO !!!在不使用@Resource的情况下 尝试修customObjectTemplate名字 看看会发生什么！
    @Resource(name = "customObjectTemplate")
    private RedisTemplate customObjectTemplate1;

    @Override
    public void useCustomObjectTemplateCache() {
        //TODO 注意与直接使用template缓存的区别
         /*UserInfo userInfo=new UserInfo();
        userInfo.setName("name2");
        userInfo.setPassword("123456");
        //key是CacheManager中配置的String序列化的
        redisTemplate.opsForValue().set("user2",userInfo);*/
        UserInfo userInfo=new UserInfo();
        userInfo.setName("name1");
        userInfo.setPassword("123456");
        customStringTemplate.opsForValue().set("user1", userInfo);
    }

    @Resource(name = "customStringTemplate")
    private RedisTemplate<String,Object> customStringTemplate;

    @Override
    public void useCustomStringTemplateCache() {
        customStringTemplate.opsForValue().set("key3", "333");
    }
}
