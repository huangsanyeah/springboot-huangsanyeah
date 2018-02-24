package com.wonders.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * springboot内置定时任务
 */
@Component
public class ScheduleJob {
    public final static long ONE_Minute =  2 * 1000;



    /*@Scheduled(fixedDelay=ONE_Minute)
    public void fixedDelayJob(){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=new Date();
        System.out.println(sdf.format(date)+" >>fixedDelay执行....");
    }*/

    /*@Scheduled(fixedRate=ONE_Minute)
    public void fixedRateJob(){
        System.out.println(System.currentTimeMillis()+" >>fixedRate执行....");
    }*/

    /*@Scheduled(cron="0 15 3 * * ?")
    public void cronJob(){
        System.out.println(System.currentTimeMillis()+" >>cron执行....");
    }*/

    @Scheduled(initialDelay = 1000*30,fixedDelay=ONE_Minute)
    public void initDelayJob(){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=new Date();
        System.out.println(sdf.format(date)+" >>fixedDelay执行....");
    }
}
