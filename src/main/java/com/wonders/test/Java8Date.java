package com.wonders.test;

import java.time.*;

/**
 * @Description java8新增的日期API  参考 https://blog.csdn.net/chenleixing/article/details/44408875
 * Instant：瞬时实例。
 * LocalDate：本地日期，不包含具体时间 例如：2014-01-14 可以用来记录生日、纪念日、加盟日等。
 * LocalTime：本地时间，不包含日期。
 * LocalDateTime：组合了日期和时间，但不包含时差和时区信息。
 * ZonedDateTime：最完整的日期时间，包含时区和相对UTC或格林威治的时差
 * @Author huangweiyue
 * @Date Created in 2018-07-07 16:34
 * @ModifiedBy
 * @Version v1.0
 */
public class Java8Date {
    public static void main(String[] args) {
        //---------------------Clock---------------------------------
        Clock clock = Clock.systemUTC();
        //当前时刻2018-07-07T08:44:40.725Z
        System.out.println("当前时刻" + clock.instant());
        //获取clock对应毫秒数 clock.millis()用来取代System.currentTimeMillis()  输出1530953080792
        System.out.println(System.currentTimeMillis());
        System.out.println(clock.millis());


        //--------------------Duration---------------------------------
        Duration duration = Duration.ofSeconds(6000);
        System.out.println("6000秒相当于--->" + duration.toMinutes() + "分");
        System.out.println("6000秒相当于--->" + duration.toHours() + "小时");
        //注意 输出0天
        System.out.println("6000秒相当于--->" + duration.toDays() + "天");


        //-----------------------LocalDate------------------------------
        LocalDate localDate = LocalDate.now();
        //2018-07-07
        System.out.println("localDate--->" + localDate.toString());
        //获得2014年的第146天
        localDate = LocalDate.ofYearDay(2014, 146);
        System.out.println(localDate);
        //设置为2014年5月21日 即：获取特定的日期 直接set即可
        localDate = LocalDate.of(2014, Month.MAY, 21);
        System.out.println(localDate);

        LocalDate today = LocalDate.now();
        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        System.out.printf("Year : %d Month : %d day : %d \t %n", year, month, day);
        //--------------------------LocalTime-----------------------------
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime--->" + localTime);
        localTime = LocalTime.of(22, 33);
        //设置为22点33分
        System.out.println(localTime);
        //返回一天中的第5500秒   01:31:40
        System.out.println(LocalTime.ofSecondOfDay(5500));


        //-------------------------LocalDateTme----------------------------
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime--->" + localDateTime);

    }
}
