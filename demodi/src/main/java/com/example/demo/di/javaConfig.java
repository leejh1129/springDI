package com.example.demo.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class javaConfig {

	@Bean
	public Speaker speaker() {
		System.out.println("speaker 등록");
		return new AppleSpeaker();
	}
	
	@Bean
	public TV tv() {
		System.out.println("tv등록");
		return new SamsungTV(speaker());
	}
	
}
