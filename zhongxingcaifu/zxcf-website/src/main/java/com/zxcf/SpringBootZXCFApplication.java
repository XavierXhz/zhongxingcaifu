package com.zxcf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zxcf.core.mapper")
public class SpringBootZXCFApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootZXCFApplication.class, args);
	}
}
