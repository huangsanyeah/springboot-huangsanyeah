package com.wonders.test;

/**
 * @Description String "ab"和"a"+"b"是否==
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

        String str1 = "ab";
        String str2 = "a" + "b";
        //相等
        System.out.println(str1 == str2);

    }
}
