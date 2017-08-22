package com.example.idea177731;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WrongNoMainApplication
{
  @Bean
  public String customMessage() {

    return "Hello!";
  }
}
