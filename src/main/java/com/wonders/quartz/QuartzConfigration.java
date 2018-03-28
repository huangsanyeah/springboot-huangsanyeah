package com.wonders.quartz;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.ee.servlet.QuartzInitializerListener;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.util.Properties;

/**
 * @author huangweiyue
 * @date 2018-02-27 13:57
 * http://localhost:8848/quartz/addJob
 * {
 * "jobClassName":"HelloJob",
 * "jobGroupName":"HiGroup",
 * "cronExpression":"0/7 * * * * ? "
 * }
 * 参考：
 * https://blog.csdn.net/wujiaqi0921/article/details/78640764
 * https://www.cnblogs.com/drift-ice/p/3817269.html
 */
@Configuration
public class QuartzConfigration {
    /**
     * 设置调度工厂，并返回调度管理器
     * 交由spring管理,使用时由autowire注入
     *
     * @return
     * @throws IOException
     * @throws SchedulerException
     */
    @Bean
    public Scheduler schedule() throws IOException, SchedulerException {
        SchedulerFactory schedulerFactory = new StdSchedulerFactory(quartzProperties());
        Scheduler scheduler = schedulerFactory.getScheduler();
        scheduler.start();
        return scheduler;
    }


    /**
     * 设置quartz属性
     *
     * @throws IOException
     */
    public static Properties quartzProperties() throws IOException {
        Properties prop = new Properties();
        prop.put("org.quartz.threadPool.class", "org.quartz.simpl.SimpleThreadPool");//实例化threadPool时,使用的线程类为SimpleThreadPool
        //threadCount和threadPriority将setter的形式注入ThreadPoolS实例
        prop.put("org.quartz.threadPool.threadCount", "5");//并发数
        prop.put("org.quartz.threadPool.threadPriority", "5");//优先级
        prop.put("org.quartz.scheduler.threadsInheritContextClassLoaderOfInitializer", true);
        //prop.put("org.quartz.jobStore.class", "org.quartz.simpl.RAMJobStore");//默认存储在内存中
        prop.put("org.quartz.jobStore.class", "org.quartz.impl.jdbcjobstore.JobStoreTX");//数据库持久化
        prop.put("org.quartz.jobStore.driverDelegateClass", "org.quartz.impl.jdbcjobstore.StdJDBCDelegate");
//        prop.put("org.quartz.jobStore.isClustered", false);//是否开启集群
//        prop.put("org.quartz.jobStore.clusterCheckinInterval", 20000);//集群检查
        prop.put("org.quartz.jobStore.tablePrefix", "QRTZ_");//表前缀:true
        prop.put("org.quartz.jobStore.dataSource", "mytest");//数据库
        prop.put("org.quartz.dataSource.mytest.driver", "com.mysql.jdbc.Driver");
        prop.put("org.quartz.dataSource.mytest.URL", "jdbc:mysql://localhost:3306/test?characterEncoding=UTF-8");
        prop.put("org.quartz.dataSource.mytest.user", "root");
        prop.put("org.quartz.dataSource.mytest.password", "123456");
        prop.put("org.quartz.dataSource.mytest.maxConnections", "10");
        return prop;
    }

    /**
     * 监听到工程的启动，在工程停止再启动时可以让已有的定时任务继续进行
     *
     * @return
     */
    @Bean
    public QuartzInitializerListener quartzInitializerListener() {
        return new QuartzInitializerListener();
    }
}
