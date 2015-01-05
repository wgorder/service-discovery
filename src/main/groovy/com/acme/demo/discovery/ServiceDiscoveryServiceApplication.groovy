package com.acme.demo.discovery

import org.springframework.boot.SpringApplication

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer


/**
 * The Eureka server.  We could run multiple instances but for this demo we are just running a single
 * standalone instance with no peer discovery.
 *
 * @author William Gorder
 * @since 12/30/2014
 */
@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
class ServiceDiscoveryServiceApplication {

    static void main(String[] args) {
        SpringApplication.run ServiceDiscoveryServiceApplication, args
    }
}
