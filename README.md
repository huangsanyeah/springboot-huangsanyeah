# springboot-mybatis
这是一个springboot整合mybatis以及mybatisGenerator的demo框架
https://github.com/huangsanyeah/springboot-mybatis

这个分支整合poi导出：
1.pom.xml引入依赖
<dependency>
  	<groupId>org.apache.poi</groupId>
  	<artifactId>poi</artifactId>
  	<version>3.17</version>
</dependency>
<dependency>
  	<groupId>org.apache.poi</groupId>
  	<artifactId>poi-ooxml</artifactId>
  	<version>3.17</version>
</dependency>

2.新建实体类PoiEntity get set 序列化

3.导出方法：
1)方法里面可以加查询条件参数
2)headers自己改
3)后台查询数据自己写（调用持久层，我这里直接模拟了数据没有查询）
4)遍历集合数据，产生数据行的时候，反射，类改成自己的实体类PoiEntity t = (PoiEntity) it.next();//自己的实体类
5)excel的名称自己设置：response.setHeader("Content-disposition", "attachment;filename=poi导出模板.xls");//默认Excel名称

ps：
1.这个是简单的excel导出 后续完善复杂的怎么弄：比如合并单元格 加上计算统计的这种
2.导入也要做

参考：
http://blog.csdn.net/zsl129/article/details/52962074
