package com.microservices.Gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/sms-notification/**")
                        .uri("http://sms:8140/"))
                .route(r -> r.path("/email-notification/**")
                        .uri("http://email:8141/"))
                .route(r -> r.path("/push-notification/**")
                        .uri("http://push:8142/"))
                .build();
    }

}
