# springboot-mybatis
这是一个springboot整合mybatis以及mybatisGenerator的demo框架 这个分支整合了redis缓存
https://github.com/huangs
anyeah/springboot-mybatis

redis整合步骤:
1.pom.xml添加依赖：
<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-redis</artifactId>
</dependency>
注意！不是spring-boot-starter-redis

2.配置类RedisConfig

3.启动类添加注解@EnableCaching

3.application.yml redis配置：
redis:
      database: 0
      host: localhost
      port: 6379
      password:
      pool:
        max-active: 8
        min-idle: 0
        max-wait: -1
      timeout: 0
      
4.实体类get/set 序列化接口implements Serializable

5.serviceImpl注解启用:
@CacheConfig(cacheNames = "userInfo")
以及方法上注解启用：
@Cacheable(key = "#uid.toString()")

Redis启动：
F:\redis\64bit右键命令窗口 还需要配置环境变量
执行    .\redis-server.exe redis.windows.conf


遇到的问题：
1.启动报错redis.clients.jedis.exceptions.JedisDataException: NOAUTH Authentication required
因为我的redis配置了密码（我是指定配置文件启动）
把#requirepass pass123注释掉重启就好了
redis:
      database: 0
      host: localhost
      port: 6379
      password://这里什么也不填写

2.@Cacheable(key = "#uid.toString()")
public UserInfo getUser(Long uid) {} uid是Long这里的key需要string 所以转化下否则报转换异常
3.CacheEvict CachePut不演示了 因为和spring cache中已经演示过了 这俩是一样的 区别是redis是外置的缓存，spring cache属于框架内置


redis安装使用参考：

https://redisdesktop.com/download 管理工具下载地址

win7 64位安装 http://blog.csdn.net/qq_32786873/article/details/52997462

win10 安装配置 http://blog.csdn.net/u010935342/article/details/53112392 

林炳文 http://blog.csdn.net/Evankaka/article/category/5914545

redis的安装并在java中初步使用（spring配置redis）
http://blog.csdn.net/qq_25673113/article/details/54097128


springboot整合redis：
简书
https://www.jianshu.com/p/950847a7d7fb

@EnableCaching : 开启SpringBoot缓存策略，放在启动主类。
@CacheConfig(cacheNames = "XXX") : 设置一个名为”XXX”的缓存空间。
@Cacheable : Spring在每次执行前都会检查Cache中是否存在相同key的缓存元素，如果存在就不再执行该方法，而是直接从缓存中获取结果进行返回，否则才会执行并将返回结果存入指定的缓存中。多用于查操作
@CacheEvict : 清除缓存。多用于删除操作
@CachePut : 也可以声明一个方法支持缓存功能。使用@CachePut标注的方法在执行前不会去检查缓存中是否存在之前执行过的结果，而是每次都会执行该方法，并将执行结果以键值对的形式存入指定的缓存中。多用于增和改操作


