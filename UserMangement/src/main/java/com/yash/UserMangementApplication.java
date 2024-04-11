package com.yash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties
public class UserMangementApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserMangementApplication.class, args);
	}

}
