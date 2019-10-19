package com.example.awsLambda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class AwsLambdaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwsLambdaApplication.class, args);
    }

//    @Bean
//    public Function<String, String> image() {
//        return (input) -> {
//            if (input.length() > 5) return "valid image"; // demo code
//            else return "invalid image";
//        };
//    }

}
