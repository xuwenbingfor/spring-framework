package com.jz.test.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:context/applicationContext.xml");
		Hello hello = (Hello) ac.getBean("hello");
		hello.hello();
	}
}
