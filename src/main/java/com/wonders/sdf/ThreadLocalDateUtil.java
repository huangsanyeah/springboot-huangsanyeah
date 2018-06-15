package com.wonders.sdf;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @Description sdf时间格式化的线程安全的工具类
 * @Author huangweiyue
 * @Date Created in 2018-06-15 23:04
 * @ModifiedBy
 * @Version v1.0
 */
public class ThreadLocalDateUtil {
    /**
     * @Description:impleDateFormate sdf = new SimpleDateFormat();使用sdf.parse(dateStr);sdf.format(date);
     * 在sdf内有一个对Caleadar对象的引用，
     * 在源码sdf.parse(dateStr);源码中calendar.clear();和calendar.getTime(); // 获取calendar的时间
     * 如果 线程A 调用了 sdf.parse(), 并且进行了 calendar.clear()后还未执行calendar.getTime()的时候,线程B又调用了sdf.parse(), 这时候线程B也执行了sdf.clear()方法, 这样就导致线程A的的calendar数据被清空了;
     * ThreadLocal是使用空间换时间，synchronized是使用时间换空间
     **/

    private static final ThreadLocal<DateFormat> messageFormat = new ThreadLocal<DateFormat>();
    private static final String MESSAGE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static final DateFormat getDateFormat() {
        DateFormat format = messageFormat.get();
        //去get，如果当前线程已有对应实例，就直接返回，如果没有，就创建一个并返回
        if (format == null) {
            format = new SimpleDateFormat(MESSAGE_FORMAT, Locale.getDefault());
            messageFormat.set(format);
        }

        return format;
    }

    public static String formatDate(Date date) throws ParseException {
        return getDateFormat().format(date);
    }

    public static Date parse(String strDate) throws ParseException {
        return getDateFormat().parse(strDate);
    }
}
