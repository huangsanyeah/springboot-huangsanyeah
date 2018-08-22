package com.wonders.test;

import lombok.Data;

/**
 * @Description Booelan类型 is开头 测试
 * @Author huangweiyue
 * @Date Created in 2018-07-31 17:41
 * @ModifiedBy
 * @Version v1.0
 */
@Data
public class BooleanTest {
    private boolean isActive;

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public static void main(String[] args) {
        BooleanTest booleanTest = new BooleanTest();
        booleanTest.isActive();
    }
}
