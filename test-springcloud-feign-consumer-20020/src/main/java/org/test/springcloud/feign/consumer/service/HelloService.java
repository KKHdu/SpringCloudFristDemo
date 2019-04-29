package org.test.springcloud.feign.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("spring-boot-hello")
public interface HelloService {

//	@RequestMapping("/hello")
//	String hello();

	@RequestMapping(value="/hello",method = RequestMethod.POST)
	String index(@RequestBody String a);
}
