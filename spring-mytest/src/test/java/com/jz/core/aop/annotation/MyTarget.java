package com.jz.core.aop.annotation;

import org.springframework.stereotype.Component;

@Component
public class MyTarget implements IMyTarget{
	@Override
	public void run(String name) {
		System.out.println(name + " target is running");
	}
}
