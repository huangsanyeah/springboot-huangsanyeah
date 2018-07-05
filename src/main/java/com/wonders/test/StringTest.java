package com.wonders.test;

/**
 * @Description
 * @Author huangweiyue
 * @Date Created in 2018-07-04 19:05
 * @ModifiedBy
 * @Version v1.0
 */
public class StringTest {
    public static void main(String[] args) {
        String s = "abcdef";
        String s1 = "abc";
        char[] chars = s.toCharArray();
        System.out.println(s.compareTo(s1));

    }
}
