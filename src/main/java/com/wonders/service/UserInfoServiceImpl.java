package com.wonders.service;

import com.wonders.entity.UserInfo;
import com.wonders.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author huangwieyue
 * @date 2018-02-13 11:52
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getUser(Long uid) {
        return userInfoMapper.selectByPrimaryKey(uid);
    }
}
