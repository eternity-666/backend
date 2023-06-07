package com.example.sys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication(scanBasePackages = {"com.example"})
=======

@SpringBootApplication
>>>>>>> 135851aaf8991d8c0e08ef8cc78fa810dfc65146
@MapperScan("com.example.*.mapper")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

<<<<<<< HEAD

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

=======
>>>>>>> 135851aaf8991d8c0e08ef8cc78fa810dfc65146
}
