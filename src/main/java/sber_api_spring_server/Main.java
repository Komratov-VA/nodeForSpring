package sber_api_spring_server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import sber_api_spring_server.controllers.ApiRequestController;

@SpringBootApplication
//@PropertySource("classpath:application.properties")
public class Main {

    @Autowired
    ApiRequestController apiRequestController;

    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }

}
