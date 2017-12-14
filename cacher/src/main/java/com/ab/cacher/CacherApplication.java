package com.ab.cacher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CacherApplication {

	public static void main(String[] args) {
		SpringApplication.run(CacherApplication.class, args);
	}
}
