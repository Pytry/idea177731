package com.example.idea177731;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NonExecutableApplication
{
  public static void main(String[] args){

    SpringApplication.run(NonExecutableApplication.class);
  }
  @Bean
  public String customMessage() {

    return "Hello!";
  }
}
