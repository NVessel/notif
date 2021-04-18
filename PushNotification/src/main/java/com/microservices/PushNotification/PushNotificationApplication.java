package com.microservices.PushNotification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PushNotificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(PushNotificationApplication.class, args);
	}

}
