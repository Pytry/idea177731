package com.example.idea177731;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NonExecutableRestApi
{
  @Value("customMessage")
  private String customMessage;

  @RequestMapping
  public String index() {

    return "Hello!";
  }
}
