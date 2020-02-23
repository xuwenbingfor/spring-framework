package com.jz.core.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:aop/applicationContext.xml");
		ICar car = (ICar) ac.getBean("bmw");
		car.run();
	}
}
