package com.spring.sec;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	 @RequestMapping("/home")
	  public String home() {
	    return "Hello Docker World";
	  }
}
