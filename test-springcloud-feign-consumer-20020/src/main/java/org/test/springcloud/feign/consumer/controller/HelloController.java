package org.test.springcloud.feign.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.test.springcloud.feign.consumer.service.HelloService;

@RestController
public class HelloController {
	@Autowired
	private HelloService helloService;

	@RequestMapping(value = "/feign-consumer")
	public String hello() {
		String a = "来了老弟";
// 		String re1 = helloService.hello();
		String re2 = helloService.index(a);
//		System.out.println(re1);
		System.out.println(re2);
		return re2;
	}
}
