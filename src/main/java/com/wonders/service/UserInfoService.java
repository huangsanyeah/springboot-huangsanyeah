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
     * 使用注解缓存
     *
     * @param uid
     * @return
     */
    UserInfo cacheUserByKeyGenerator(Long uid);

    /**
     * 使用原生redisTempPlate缓存
     */
    void useRedisTemplateCache();

    /**
     * 使用StringRedisTemplate缓存
     */
    void useStringRedisTemplateCache();


    /**
     * 使用自定义对象Template缓存
     */
    void useCustomObjectTemplateCache();


    /**
     * 使用自定义StringTemplate缓存
     */
    void useCustomStringTemplateCache();
}
