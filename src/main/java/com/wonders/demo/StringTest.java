package com.wonders.demo;

/**
 * @Description String "ab"和"a"+"b"是否==
 * @Author huangweiyue
 * @Date Created in 2018-07-04 19:05
 * @ModifiedBy
 * @Version v1.0
 */
public class StringTest {
    public static void main(String[] args) {
      /*  String s = "abcdef";
        String s1 = "abc";
        char[] chars = s.toCharArray();
        System.out.println(s.compareTo(s1));

        String str1 = "ab";
        String str2 = "a" + "b";
        //相等
        System.out.println(str1 == str2);*/


        String a = "abc";
        String b = "abc";
        String c = new String("abc");
        String d = "ab" + "c";
        //"a == b" + a == b中的+ 相当于拼接字符串了 要注意优先级
       /* System.out.println("a == b" + a == b); //false
        System.out.println("a == c" + a == c); //false
        System.out.println("a == d" + a == d); //false
        System.out.println("b == c" + b == c); //false
        System.out.println("b == d" + b == d); //false
        System.out.println("c == d" + c == d); //false*/
        System.out.println(a == b); //true
        System.out.println(a == c); //false
        System.out.println(a == d); //true
        System.out.println(b == c); //false
        System.out.println(b == d); //true
        System.out.println(c == d); //false

    }
}
