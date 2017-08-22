package com.example.idea177731;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Copyright ${year}
 *
 * @author J. Keith Hoopes
 */
public class NonExecutableInitializer
    extends SpringBootServletInitializer
{
  @Override
  public SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

    builder
        .application()
        .setMainApplicationClass(NonExecutableRestApi.class);

    return builder;
  }
}
