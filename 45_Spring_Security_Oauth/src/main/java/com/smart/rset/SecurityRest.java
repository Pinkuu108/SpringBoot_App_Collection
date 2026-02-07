package com.smart.rset;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityRest {
  @GetMapping("/")
  public String getMethodName() {
      return "Welcome to Oauth:)";
  }
  
}
