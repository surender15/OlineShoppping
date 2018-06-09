package com.ds.onlineshopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.ds.onlineshopping.controller","com.ds.shoppingbackend.dao*"})
@SpringBootApplication
public class OnlineshoppingApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(OnlineshoppingApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(OnlineshoppingApplication.class, args);
	}
}