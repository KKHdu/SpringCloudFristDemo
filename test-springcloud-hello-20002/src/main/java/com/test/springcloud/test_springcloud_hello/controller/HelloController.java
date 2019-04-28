package com.test.springcloud.test_springcloud_hello.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	private Logger log = Logger.getLogger(this.getClass());
	
	@RequestMapping ("/hello")
	public String index() {
		log.info("test-springcloud-hello-20001 / test-springcloud-hello-20002");
		return "Hello World 20000";
	}
}
