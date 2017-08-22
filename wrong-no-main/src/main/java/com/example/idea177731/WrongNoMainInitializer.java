package com.example.idea177731;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

public class WrongNoMainInitializer
    extends SpringBootServletInitializer
{
  @Override
  public SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

    return builder.sources(WrongNoMainRestApi.class);
  }
}
