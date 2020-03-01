package com.jz.tx;

import com.jz.tx.config.MyApplicationConfig;
import com.jz.tx.service.IProductService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context
				= new AnnotationConfigApplicationContext(MyApplicationConfig.class);
		IProductService productService = context.getBean(IProductService.class);
		productService.insertProduct();
	}

}
