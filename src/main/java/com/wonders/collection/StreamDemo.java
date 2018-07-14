package com.wonders.collection;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description Stream 这种风格将要处理的元素集合看作一种流， 流在管道中传输， 并且可以在管道的节点上进行处理， 比如筛选， 排序，聚合等。
 * @Author huangweiyue
 * @Date Created in 2018-07-13 18:49
 * @ModifiedBy
 * @Version v1.0
 */
public class StreamDemo {
    public static void main(String[] args) {
        Collection collection = new HashSet();
        collection.add("NBA2017年总冠军球队是金州勇士哈");
        collection.add("大灌篮");
        collection.add("伟大的迈克尔乔丹哈");
        collection.add("了不起的盖茨比");
        collection.add("哈哈哈哈哈哈哈哈哈哈哈哈哈哈");
        collection.add("12138");
        //输出集合中包含字符串“哈”的
        System.out.println(collection.stream().filter(ele -> ((String) ele).contains("哈")).count());

        //注意 Collectors.toSet()这个方法，把过滤后的结果包装成集合返回
        HashSet c = (HashSet) collection.stream().filter(ele -> ((String) ele).contains("哈")).collect(Collectors.toSet());
        System.out.println(c);


        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        //过滤掉空字符串
        System.out.println(filtered);


        /*
         *Stream 提供了新的方法 'forEach' 来迭代流中的每个数据。以下代码片段使用 forEach 输出了10个随机数
        */

        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);


        //map 方法用于映射每个元素到对应的结果，以下代码片段使用 map 输出了元素对应的平方数：
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        // 获取对应的平方数,数组中的数据distinct去重了
        List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        System.out.println(squaresList);


        //filter 方法用于通过设置的条件过滤出元素。以下代码片段使用 filter 方法过滤出空字符串
        List<String> emptyStrings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        // 获取空字符串的数量
        Long count = emptyStrings.stream().filter(string -> string.isEmpty()).count();
        System.out.println("用filter来过滤得出emptyStrings中空字符串的数量" + count);


        //Collectors 类实现了很多归约操作，例如将流转换成集合和聚合元素。Collectors 可用于返回列表或字符串
        List<String> stringList = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> stringListFiltered = stringList.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println("筛选列表: " + stringListFiltered);

        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("合并字符串: " + mergedString);


        //另外，一些产生统计结果的收集器也非常有用。它们主要用于int、double、long等基本类型上，它们可以用来产生类似如下的统计结果。
        List<Integer> staticsList = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        IntSummaryStatistics stats = staticsList.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("列表中最大的数 : " + stats.getMax());
        System.out.println("列表中最小的数 : " + stats.getMin());
        System.out.println("所有数之和 : " + stats.getSum());
        System.out.println("平均数 : " + stats.getAverage());


    }
}
