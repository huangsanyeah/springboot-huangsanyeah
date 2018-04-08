package com.wonders.validator;

import com.wonders.entity.UserInfo;
import com.wonders.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author huangweiyue
 * @date 2018-04-04
 */
@Slf4j
public class CustomValidator implements ConstraintValidator<CustomAnnotation, Object> {  //两个泛型分别为自定义注解和要校验的类型
    @Autowired
    private UserInfoService userService;


    /**
     * 初始化
     */
    @Override
    public void initialize(CustomAnnotation customAnnotation) {
        log.info("---初始化自定义注解---");
    }

    /**
     * 校验逻辑
     *
     * @param o                          //校验的参数
     * @param constraintValidatorContext
     * @return
     */
    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        Boolean flag;
        log.info(o.toString());
        try {
            UserInfo userInfo = userService.getUserByName(o.toString());
            if (userInfo != null && userInfo.getState() == (byte) 1) {
                flag = true;
            } else {
                flag = false;
            }
            return flag;
        } catch (Exception e) {
            log.error("校验异常，{}", e);

        }
        return false;

    }
}
