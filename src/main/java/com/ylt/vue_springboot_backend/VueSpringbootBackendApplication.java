package com.ylt.vue_springboot_backend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ylt.mapper")
@SpringBootApplication
public class VueSpringbootBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(VueSpringbootBackendApplication.class, args);
	}

}
