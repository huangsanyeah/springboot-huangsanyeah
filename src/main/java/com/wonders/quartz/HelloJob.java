package com.wonders.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalTime;

/**
 * @author huangweiyue
 * @date 2018-03-28 17:11
 */
public class HelloJob implements Job {

    private static Logger logger = LoggerFactory.getLogger(HelloJob.class);

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("hello jon执行时间: " + LocalTime.now());
        System.out.println("hello jon执行时间: " + LocalTime.now());
    }
}