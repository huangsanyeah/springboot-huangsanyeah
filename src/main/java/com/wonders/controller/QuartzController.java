package com.wonders.controller;

import com.wonders.entity.TaskInfo;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author huangweiyue
 * @date 2018-03-28 17:08
 */
@RequestMapping("/quartz")
@Controller
public class QuartzController {
    @Autowired
    private Scheduler scheduler;


    @RequestMapping("/addJob")
    @ResponseBody
    public String addjob(@RequestBody  TaskInfo job) throws Exception//String jobClassName, String jobGroupName, String cronExpression) throws Exception
    {
        try {
//        QuartzFactory quartzFactory = new QuartzFactory();
//        Scheduler scheduler = quartzFactory.schedule();
            JobDetail jobDetail = JobBuilder.newJob(getClass(job.getJobClassName()).getClass())
                    .withIdentity(job.getJobClassName(), job.getJobGroupName()).requestRecovery().build();
            //创建表达式调度构建起
            CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(job.getCronExpression());
            //根据传入的cron表达式创建一个触发器
            CronTrigger trigger = TriggerBuilder.newTrigger().withIdentity(job.getJobClassName(), job.getJobGroupName())
                    .withSchedule(scheduleBuilder).build();
            try {
                scheduler.scheduleJob(jobDetail, trigger);

            } catch (SchedulerException e) {
                System.out.println("创建定时任务失败"+e);
                throw new Exception("创建定时任务失败");
            }
            return "添加JOB成功";
        } catch (SchedulerException e) {
            return "添加JOB失败";
        }

    }

   /* public static Job getClass(String classname) throws Exception
    {
        Class<?> class1 = Class.forName(classname);
        return (Job) class1.newInstance();
    }*/

/*
    @Path("pausejob")
//    @Produces(TYPE_JSON)
    @Consumes(TYPE_JSON)
    @POST
    public Response pausejob(TaskInfo job) throws Exception
    {
        scheduler.pauseJob(JobKey.jobKey(job.getJobClassName(), job.getJobGroupName()));
        return buildSuccessMessage("success");
    }



    @Path("resumejob")
//    @Produces(TYPE_JSON)
    @POST
    @Consumes(TYPE_JSON)
    public Response resumejob(TaskInfo job) throws Exception
    {
        scheduler.resumeJob(JobKey.jobKey(job.getJobClassName(), job.getJobGroupName()));
        return buildSuccessMessage("success");
    }



    @Path("rescheduleJob")
//    @Produces(TYPE_JSON)
    @POST
    @Consumes(TYPE_JSON)
    public Response rescheduleJob(TaskInfo job) throws Exception
    {
        try {
            TriggerKey triggerKey = TriggerKey.triggerKey(job.getJobClassName(), job.getJobGroupName());
            CronTrigger trigger = (CronTrigger) scheduler.getTrigger(triggerKey);
            CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(job.getCronExpression());
            // 按新的cronExpression表达式重新构建trigger
            trigger = trigger.getTriggerBuilder().withIdentity(triggerKey).withSchedule(scheduleBuilder).build();
            scheduler.rescheduleJob(triggerKey, trigger);
            return buildSuccessMessage("success");
        } catch (SchedulerException e) {
            return buildFailMessage("failed");
        }

    }



    @Path("deletejob")
//    @Produces(TYPE_JSON)
    @POST
    @Consumes(TYPE_JSON)
    public Response deletejob(TaskInfo job) throws Exception
    {
        try {
            //暂停触发器
            scheduler.pauseTrigger(TriggerKey.triggerKey(job.getJobClassName(), job.getJobGroupName()));
            //暂停任务
            scheduler.unscheduleJob(TriggerKey.triggerKey(job.getJobClassName(), job.getJobGroupName()));
            //删除任务
            scheduler.deleteJob(JobKey.jobKey(job.getJobClassName(), job.getJobGroupName()));
            return buildSuccessMessage("success");
        } catch (SchedulerException e) {
            return buildFailMessage("faild");
        }

    }*/

    public static Job getClass(String classname) throws Exception
    {
        String packageName = "com.wonders.quartz.";
        classname = packageName.concat(classname);
        Class<?> class1 = Class.forName(classname);
        return (Job)class1.newInstance();
    }
}

