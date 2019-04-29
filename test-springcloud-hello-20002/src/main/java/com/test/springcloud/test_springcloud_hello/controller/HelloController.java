package com.test.springcloud.test_springcloud_hello.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	private Logger log = Logger.getLogger(this.getClass());
	
	@RequestMapping ("/hello")
	public String index(@RequestBody String a) {
		String c = "Hello SpringCloud 20002"+a;
		log.info("test-springcloud-hello-20001 / test-springcloud-hello-20001");
		return c;
	}
}
