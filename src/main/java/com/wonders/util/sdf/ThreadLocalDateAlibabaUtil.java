package com.wonders.util.sdf;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description 阿里巴巴官方推荐的sdf日期格式化类
 * @Author huangweiyue
 * @Date Created in 2018-06-15 23:45
 * @ModifiedBy
 * @Version v1.0
 */
public class ThreadLocalDateAlibabaUtil {
    private static ThreadLocal<DateFormat> threadLocal = new ThreadLocal<DateFormat>() {
        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    };

    public static Date parse(String dateStr) throws ParseException {
        return threadLocal.get().parse(dateStr);
    }

    public static String format(Date date) {
        return threadLocal.get().format(date);
    }
}
