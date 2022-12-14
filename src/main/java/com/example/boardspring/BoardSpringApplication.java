package com.example.boardspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.filter.HiddenHttpMethodFilter;

@EnableJpaAuditing
@SpringBootApplication
public class BoardSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(BoardSpringApplication.class, args);
    }

    // HiddenHttpMethodFilter를 Bean으로 등록하여,
    // @PutMapping과 @DeleteMapping이 작동할 수 있게 한다.
    @Bean
    public HiddenHttpMethodFilter hiddenHttpMethodFilter() {
        return new HiddenHttpMethodFilter();
    }
}
