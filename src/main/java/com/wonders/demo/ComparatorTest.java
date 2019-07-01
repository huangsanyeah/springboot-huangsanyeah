package com.wonders.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author huangweiyue
 * @description Comparator方式进行比较 【外部排序】 不需要实现Comparable接口  无法修改实体类时，直接在调用方创建
 * @date Created in 2019-06-28
 */
public class ComparatorTest {
    public static void main(String[] args) {
        List<Emp> list = new ArrayList<>();
        Emp test1 = new Emp(69, "李四");
        Emp test2 = new Emp(29, "王五");
        Emp test3 = new Emp(28, "赵六");
        Emp test4 = new Emp(20, "钱三");
        list.add(test4);
        list.add(test3);
        list.add(test2);
        list.add(test1);
        Collections.sort(list, (o1, o2) -> {
            if (o1.age == o2.age && o1.name == o2.name) {
                return 0;
            } else if (o1.age > o2.age) {
                return 1;
            } else {
                return 0;
            }
        });
        for (Object s : list) {
            System.out.println(s);
        }
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Emp {
    public int age;
    public String name;
}