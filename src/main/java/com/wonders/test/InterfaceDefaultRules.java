package com.wonders.test;

/**
 * @author huangweiyue
 * @description 接口的默认实现规则
 * @date Created in 2019-06-06

 */
public interface InterfaceDefaultRules {
    /**
     * 变量是默认public static final
     */
    public static final int a=1;

    //TODO 实际用的时候我们省略public static final
    int b=2;

    /***
     * @description 方法默认是public abstract
     * @author huangweiyue
     * @date Created in 2019/6/6-22:07
     */
    public abstract void testMethodOne();

    //TODO 实际用的时候我们省略public abstract
    void testMethodTwo();
}
