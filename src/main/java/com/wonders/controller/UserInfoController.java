package com.wonders.controller;

import com.wonders.entity.UserInfo;
import com.wonders.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangwieyue
 * @date 2018-02-13 11:48
 */
@RestController
@RequestMapping("springboot")
//http://localhost:8075/springboot/getUser?uid=1
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;
    @RequestMapping("/getUser")
    public UserInfo getUser(Long uid){
        return userInfoService.getUser(uid);
    }

    /**
     * *想要看一个注解，直接点进去 比如 RequestParam 就可以看到有什么参数可以设置了 比如name defaultValue
     **/

    @RequestMapping("/zhujie")
    public UserInfo getr(@RequestParam() String name) {
        return null;
    }
}
