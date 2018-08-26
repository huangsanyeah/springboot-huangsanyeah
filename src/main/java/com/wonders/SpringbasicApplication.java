package com.wonders;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@MapperScan("com.wonders.mapper")
@EnableAsync
public class SpringbasicApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbasicApplication.class, args);
	}
}
