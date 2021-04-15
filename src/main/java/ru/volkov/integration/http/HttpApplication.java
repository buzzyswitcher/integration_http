package ru.volkov.integration.http;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.config.EnableIntegration;

@SpringBootApplication
@EnableIntegration
@ImportResource("classpath:integration_context.xml")
public class HttpApplication implements ApplicationRunner {

    @Autowired
    private SimpleGateway gateway;

    public static void main(String[] args) {
        SpringApplication.run(HttpApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        this.gateway.execute("Anything");
    }
}
