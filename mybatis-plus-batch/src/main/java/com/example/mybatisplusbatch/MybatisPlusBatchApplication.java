package com.example.mybatisplusbatch;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mybatisplusbatch.mp.*.mapper")
public class MybatisPlusBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisPlusBatchApplication.class, args);
	}

}
