package com.wonders.test;

/**
 * @Description 测试成员变量和局部变量初始化的问题 局部变量除了形参需要显式的初始化 如 int b    成员变量则不需要 如 int a
 * @Author huangweiyue
 * @Date Created in 2018-06-27 18:15
 * @ModifiedBy
 * @Version v1.0
 */
public class VariableInitialTest {
    //成员变量就不需要显示的初始化,会默认初始化
    int a;

    public static void main(String[] args) {
        //局部变量除了形参外必须显式的初始化
        int b;
//        System.out.println(b);
    }
}
