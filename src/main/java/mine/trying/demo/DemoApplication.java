package mine.trying.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.inject.Inject;

@SpringBootApplication
public class DemoApplication {
    @Inject
    QueueController controller;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
