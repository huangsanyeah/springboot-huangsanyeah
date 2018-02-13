package com.wonders;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wonders.mapper")
public class SpringbasicApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbasicApplication.class, args);
	}
}
