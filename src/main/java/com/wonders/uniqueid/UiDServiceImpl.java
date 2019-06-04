package com.wonders.uniqueid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.text.NumberFormat;

/**
 * @author huangweiyue
 * @version v1.0
 * @task
 * @description
 * @date Created in 2019-04-24
 * @modifiedBy
 */
@Service
public class UiDServiceImpl implements UidService{

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public Long fetchUUID(String key, Long length) {
        Long uid = stringRedisTemplate.opsForValue().increment(key,length);
        System.out.println(uid);
        return uid;
    }

    private Long createUUID(Long num, String day, Integer length) {
        String id = String.valueOf(num);
        if (id.length() < length) {
            NumberFormat nf = NumberFormat.getInstance();
            nf.setGroupingUsed(false);
            nf.setMaximumIntegerDigits(length);
            nf.setMinimumIntegerDigits(length);
            id = nf.format(num);
        }
        return Long.parseLong(day + id);
    }
}
