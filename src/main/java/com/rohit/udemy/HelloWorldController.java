package com.rohit.udemy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloWorldController {

	@RequestMapping(path="/hello" , method=RequestMethod.GET)
	public String sayHello() {
		return "hello";
	}
	
}
