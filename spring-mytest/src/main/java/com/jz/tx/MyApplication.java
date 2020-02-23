package com.jz.tx;

import com.jz.tx.config.MyApplicationConfig;
import com.jz.tx.service.IPayService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context
				= new AnnotationConfigApplicationContext(MyApplicationConfig.class);
		IPayService payService = (IPayService) context.getBean("PayServiceImpl");
	}

}
