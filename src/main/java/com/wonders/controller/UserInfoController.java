package com.wonders.controller;

import com.wonders.entity.UserInfo;
import com.wonders.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author huangwieyue
 * @date 2018-02-13 11:48
 */
@RestController
@RequestMapping("/springboot")
@Slf4j
//http://localhost:8075/springboot/getUser?uid=1
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;
    @RequestMapping("/getUser")
    public UserInfo getUser(Long uid){
        return userInfoService.getUser(uid);
    }

    /**
     * *想要看一个注解，直接点进去 比如 RequestParam 就可以看到有什么参数可以设置了 比如name defaultValue required(是否必须)
     **/

    @RequestMapping("/zhujie")
    public UserInfo getr(@RequestParam() String name) {
        return null;
    }

    /**
     * dateTimeFormat注解测试
     * http://localhost:8075/springboot/dateFormat?day=2018/01/02 10:32:04
     *
     * @param day
     * @return
     */
    @GetMapping("/dateFormat")
    public String testDateTimeFormatAnnotation(@DateTimeFormat(iso = DateTimeFormat.ISO.DATE, pattern = "yyyy/mm/dd hh:mm:ss") Date day) {
        log.info("入参day--->" + day);
        return day.toString();
    }
}
