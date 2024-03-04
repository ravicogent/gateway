package com.cogent.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
	
//	@Bean
//	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
//	    return builder.routes()
//	        .route(p -> p
//	            .path("/auth/**")
//	            .uri("http://localhost:9898")
//	            .filter(f -> f
//                        .filter(authenticationFilter)
//                        .stripPrefix(1)))
//	        .route(p -> p
//		            .path("/product/**")
//		            .uri("http://localhost:8081"))
//	        .route(p -> p
//		            .path("/shopapi/**")
//		            .uri("http://localhost:8082"))
//	        .build();
//	}
}
