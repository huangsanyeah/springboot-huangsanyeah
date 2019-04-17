package com.wonders.util.sdf;

import java.util.Date;

/**
 * @Description 验证DateUtil sdf时间格式化的demo
 * @Author huangweiyue
 * @Date Created in 2018-06-15 23:17
 * @ModifiedBy
 * @Version v1.0
 */
public class SdfDemo {
    public static void main(String[] args) {
        String date = ThreadLocalDateUtil.getDateFormat().format(new Date());
        System.out.println("date------>" + date);
    }
}
