package com.wonders;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * 主要参考简书
 * https://www.jianshu.com/p/950847a7d7fb
 */
@SpringBootApplication
@MapperScan("com.wonders.mapper")
@EnableCaching
public class SpringbasicApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbasicApplication.class, args);
	}
}
