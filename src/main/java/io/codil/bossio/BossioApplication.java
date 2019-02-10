package io.codil.bossio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public  class BossioApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(BossioApplication.class, args);
    }


}