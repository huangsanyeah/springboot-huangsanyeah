package com.wonders.util.sdf;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description
 * @Author huangweiyue
 * @Date Created in 2018-06-15 23:31
 * @ModifiedBy
 * @Version v1.0
 */
public class DateSyncUtil {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static String formatDate(Date date) throws ParseException {
        synchronized (sdf) {
            return sdf.format(date);
        }
    }

    public static Date parse(String strDate) throws ParseException {
        synchronized (sdf) {
            return sdf.parse(strDate);
        }
    }
}
