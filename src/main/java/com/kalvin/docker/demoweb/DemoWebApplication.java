package com.kalvin.docker.demoweb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoWebApplication {

    private final static Logger log = LoggerFactory.getLogger(DemoWebApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoWebApplication.class, args);
    }

    @GetMapping(value = "/")
    public String helloWorld() {
        System.out.println("-------------------Hello docker world!-----------------------");
        log.info("-------------------Hello docker world!-----------------------");
        return "Hello docker world!";
    }

}
