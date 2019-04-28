package org.test.springcloud.feign.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("spring-boot-hello")
public interface HelloService {
	
	@RequestMapping("/hello")
	String hello();
}
