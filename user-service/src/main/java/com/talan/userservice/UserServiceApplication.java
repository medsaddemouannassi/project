package com.talan.userservice;

import com.talan.userservice.dto.UserRequestDTO;
import com.talan.userservice.enums.Gender;
import com.talan.userservice.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(UserService userService) {
        return args -> {
            for (int i = 1; i <= 5; i++) {
                userService.signup(new UserRequestDTO("U" + i, "UU" + i, 30 + i, Math.random() > 0.5 ? Gender.MALE : Gender.FEMALE, "u" + i + "@test.com", "u" + i));
            }
        };
    }

}
