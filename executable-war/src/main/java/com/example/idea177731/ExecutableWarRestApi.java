package com.example.idea177731;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExecutableWarRestApi
{
  @RequestMapping
  public String index() {

    return "Hello again as well!";
  }
}
