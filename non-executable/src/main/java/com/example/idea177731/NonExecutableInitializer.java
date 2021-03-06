package com.example.idea177731;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

public class NonExecutableInitializer
    extends SpringBootServletInitializer
{
  @Override
  public SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

    return builder.sources(NonExecutableRestApi.class);
  }
}
