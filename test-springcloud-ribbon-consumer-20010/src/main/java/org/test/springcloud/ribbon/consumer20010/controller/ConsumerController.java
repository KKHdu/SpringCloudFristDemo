package org.test.springcloud.ribbon.consumer20010.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.test.springcloud.ribbon.consumer20010.service.HelloService;

@RestController
public class ConsumerController {

	private Logger log = Logger.getLogger(this.getClass());

	@Autowired
	private HelloService helloService;
	
	@RequestMapping (value = "/ribbon-consumer", method = RequestMethod.GET)
	public String helloConsumer() {
		log.info("需要调用自己的类----------->");
		String result = helloService.helloConsumer();
		System.out.println("返回值："+result);
		return result;
	}
	
}
