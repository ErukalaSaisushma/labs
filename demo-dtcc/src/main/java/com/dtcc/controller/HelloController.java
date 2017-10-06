package com.dtcc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class HelloController {

	@RequestMapping("/hello")
	public String[] sayHello(){
		
		return new String[]{"Hello, World!"};
	}
}
