package com.letsstartcoding.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoClientMain {
	
	public static void main(String[] args) {
		SpringApplication.run(DemoClientMain.class, args);
	}

}
