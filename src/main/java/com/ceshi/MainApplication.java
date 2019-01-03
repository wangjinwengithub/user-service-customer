package com.ceshi;

import java.io.IOException;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ceshi.bean.UserAddress;
import com.ceshi.service.OrderService;
import com.ceshi.service.OrderService2;

public class MainApplication {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
		OrderService orderService = applicationContext.getBean(OrderService.class);
		
		orderService.initOrder("1");
		System.out.println("调用成功。。。");
		System.out.println("开始调用服务二");
		OrderService2 orderService2= applicationContext.getBean(OrderService2.class);
		List<UserAddress> list=orderService2.initOrder("2");
		for(UserAddress userAddress:list) {
			System.out.println(userAddress);
		}
		System.in.read();
		
		
	}

}
