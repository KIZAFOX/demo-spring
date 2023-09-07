package fr.kizafox.demospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class DemoSpring implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpring.class, args);
    }
}
