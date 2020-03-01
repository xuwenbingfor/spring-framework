package com.jz.core.aop.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyApplicationConfig.class);
		IMyTarget myTarget = context.getBean(IMyTarget.class);
		// myTarget如果实现了接口则使用jdk动态代理，否则使用cglib动态代理
		myTarget.run("xuwenbingfor");
	}
}
