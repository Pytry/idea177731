package com.example.idea177731;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CorrectApplication
{
  @RequestMapping
  public String index() {

    return "Hello!";
  }
}
