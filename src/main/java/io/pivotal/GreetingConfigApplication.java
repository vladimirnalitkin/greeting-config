package io.pivotal;

import io.pivotal.model.GreetingProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(GreetingProperties.class)
public class GreetingConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(GreetingConfigApplication.class, args);
    }
}