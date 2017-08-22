package com.example.idea177731;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

public class WrongPackagingInitializer
    extends SpringBootServletInitializer
{
  @Override
  public SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

    return builder.sources(WrongPackagingApplication.class);
  }
}
