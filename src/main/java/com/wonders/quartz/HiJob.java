package com.wonders.quartz;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalTime;

/**
 * @author huangweiyue
 * @date 2018-03-28 17:12
 */
@DisallowConcurrentExecution
public class HiJob implements Job {

    private static Logger logger = LoggerFactory.getLogger(HiJob.class);

    public HiJob() {

    }

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("hi jon 执行时间: " + LocalTime.now());
    }
}