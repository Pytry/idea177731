package com.example.idea177731;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CorrectAlsoApplication
    extends SpringBootServletInitializer
{
  public static void main(String[] args) {
    SpringApplication.run(CorrectAlsoApplication.class);
  }

  @Override
  public SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

    builder
        .application()
        .setMainApplicationClass(CorrectAlsoApplication.class);

    return builder;
  }

  @RequestMapping
  public String index() {

    return "Hello again as well!";
  }
}
