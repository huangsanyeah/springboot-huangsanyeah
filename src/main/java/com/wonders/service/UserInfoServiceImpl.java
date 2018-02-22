package com.wonders.service;

import com.wonders.entity.UserInfo;
import com.wonders.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author huangwieyue
 * @date 2018-02-13 11:52
 */
@Service
@CacheConfig(cacheNames = "userInfo")
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    @Cacheable(key = "#uid.toString()")
    public UserInfo getUser(Long uid) {
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(uid);
        System.out.println("service启用了redis注解缓存，第二次查询不会打印此句话");
        return userInfo;
    }
}
