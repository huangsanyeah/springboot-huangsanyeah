package com.wonders.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author huangweiyue
 * @Date Created in 2018-07-14 22:37
 * @ModifiedBy
 * @Version v1.0
 */
public class ListSort {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("NBA2017年总冠军球队是金州勇士");
        list.add("大灌篮");
        list.add("伟大的迈克尔乔丹");
        //list.sort((o1,o2)->((String) o1).length()-((String) o2).length());
        list.sort((o1, o2) -> ((String) o1).length() - ((String) o2).length());
        System.out.println(list);


        //JSON字符串编写方法
        String json = "{\"name\":\"aa\",\"ai\":\"AI\"}";
    }
}
