package com.wonders.test;

import java.util.ArrayList;

/**
 * @Description 验证Collection的ContainsAll方法
 * @Author huangweiyue
 * @Date Created in 2018-07-11 22:17
 * @ModifiedBy
 * @Version v1.0
 */
public class ContainsAllTest {
    public static void main(String[] args) {
        ArrayList<String> als = new ArrayList<String>();
        als.add("a");
        als.add("b");
        ArrayList<String> alss = new ArrayList<String>();
        alss.add("a");
        //alss.add("c");
        System.out.println(als.containsAll(alss));
    }
}
