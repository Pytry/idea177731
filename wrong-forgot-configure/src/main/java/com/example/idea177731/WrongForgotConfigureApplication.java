package com.example.idea177731;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class WrongForgotConfigureApplication
    extends SpringBootServletInitializer
{
  public static void main(String[] args) {
    SpringApplication.run(WrongForgotConfigureApplication.class, args);
  }
  //  Did not add the "configure" method override here.
}
