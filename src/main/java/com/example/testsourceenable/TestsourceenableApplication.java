package com.example.testsourceenable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableResourceServer
@EnableEurekaClient
public class TestsourceenableApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestsourceenableApplication.class, args);
    }


    @RestController
    public class SimpleController {
        @GetMapping("/whoami")
        public Object whoami(Authentication authentication) {
            return authentication;
        }
    }

}
