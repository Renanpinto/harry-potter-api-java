package com.potter.harrypotterapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.potter.harrypotterapi")
@EnableAutoConfiguration
public class HarryPotterApiApplication {

    public static void main(final String[] args) {
        SpringApplication.run(HarryPotterApiApplication.class, args);
    }

}
