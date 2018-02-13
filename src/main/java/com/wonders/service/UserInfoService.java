package com.wonders.service;

import com.wonders.entity.UserInfo;

/**
 * @author huangwieyue
 * @date 2018-02-13 11:51
 */
public interface UserInfoService {
    UserInfo getUser(Long uid);
}
