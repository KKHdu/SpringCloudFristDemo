package org.test.springcloud.ribbon.consumer20010.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.test.springcloud.ribbon.consumer20010.service.HelloService;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloServiceImpl implements HelloService {

	private Logger log = Logger.getLogger(this.getClass());

	@Autowired
	private RestTemplate restTemplate;

	// 断路器 保护系统。
	@HystrixCommand(fallbackMethod = "helloFallBack")
	@Override
	public String helloConsumer() {
		log.info("即将开始请求20001/20002的hello接口_________________>");
		return restTemplate.getForEntity("http://spring-boot-hello/hello", String.class).getBody();
	}

	// 发生异常则 指定执行此方法
	public String helloFallBack() {
		return "error error !";
	}

}
