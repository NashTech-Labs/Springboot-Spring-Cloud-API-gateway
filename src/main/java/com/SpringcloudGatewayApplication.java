package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * The type Springcloud gateway application.
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringcloudGatewayApplication {

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {

		SpringApplication.run(SpringcloudGatewayApplication.class, args);
	}

}
