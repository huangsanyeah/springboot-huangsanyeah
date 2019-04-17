package com.wonders.service;

import com.wonders.entity.UserInfo;

/**
 * @author huangwieyue
 * @date 2018-02-13 11:51
 */
public interface UserInfoService {
    /**
     * 使用注解缓存
     *
     * @param uid
     * @return
     */
    UserInfo getUser(Long uid);

    /**
     * 使用redisTemplate缓存
     */
    void useTemplateCache();
}
