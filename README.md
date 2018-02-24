# springboot-mybatis
这是一个springboot整合mybatis以及mybatisGenerator的demo框架
https://github.com/huangsanyeah/springboot-mybatis

springboot使用@Scheduled创建定时任务

步骤:
1.springboot内置了Schedule所以不需要引入新的依赖
2.启动类加注解@EnableScheduling
3.测试：创建一个类,加入到容器中，配合注解@Scheduled  initialDelay,fixedDelay,fixedRate,cron表达式来设置定时
cron表达式生成器：http://cron.qqe2.com/

参考：
https://www.jianshu.com/p/c7492aeb35a1
https://www.jianshu.com/p/ef18af5a9c1d
