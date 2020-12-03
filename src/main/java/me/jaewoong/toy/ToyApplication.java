package me.jaewoong.toy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToyApplication {

    public static void main(String[] args) {
    SpringApplication app = new SpringApplication(ToyApplication.class);
    app.run(args);
    }

}
