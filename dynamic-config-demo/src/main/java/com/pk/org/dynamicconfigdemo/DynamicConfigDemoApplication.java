package com.pk.org.dynamicconfigdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.pk.org" )
@EnableConfigServer
public class DynamicConfigDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DynamicConfigDemoApplication.class, args);
	}

}
