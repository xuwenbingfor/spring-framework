package com.jz.core.aop;

public class Bmw implements ICar {
	@Override
	public boolean run() {
		System.out.println("bmw run");
		return true;
	}
}
