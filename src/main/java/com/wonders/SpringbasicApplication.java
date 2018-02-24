package com.wonders;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.wonders.mapper")
@EnableScheduling//定时
public class SpringbasicApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbasicApplication.class, args);
	}
}
