package com.wonders.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @Description 验证Collection的retainAll方法 其实就是求【交集】collection1.retainAll(collection2) (返回的是【布尔类型】) 调用该方法后collections1就是求两者的交集
 * retainAll方法将保留与指定集合中相同的对象，而删除不相同的对象，它和removeAll方法正好相反。
 * <p>
 * 语法  boolean retainAll(Collection<?> c) 相当于把调用该方法的集合变成该集合和集合c的交集
 * <p>
 * 返回值：如果Set集合因调用本方法而改变，则返回true。
 * @Author huangweiyue
 * @Date Created in 2018-07-11 22:19
 * @ModifiedBy
 * @Version v1.0
 */
public class RetainAllTest {
    public static void main(String[] args) {
        ArrayList<String> array1 = new ArrayList<String>();
        array1.add("a");
        array1.add("b");
        //array1.add("c");
        array1.add("d");
        array1.add("e");
        ArrayList<String> array2 = new ArrayList<String>();
        array2.add("a");
        array2.add("b");
        array2.add("c");
        System.out.println(array1.retainAll(array2));
        System.out.println(array1);


        Set set1 = new HashSet();

        set1.add(new Date());     //向列表中添加数据

        set1.add("apple");      //向列表中添加数据

        set1.add("TV");      //向列表中添加数据

        System.out.println("Set1的大小为：" + set1.size());

        Set set2 = new HashSet();

        set2.add("TV");      //向列表中添加数据

        System.out.println("Set2的大小为：" + set2.size());

        set1.retainAll(set2);

        System.out.println("从Set1集合移除Set2集合包含的内容");

        System.out.println("Set1的大小为：" + set1.size());
        System.out.println(set1);

    }

}
