package com.jz.core.ioc;

public class Hello {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void hello() {
		System.out.println("hello spring!");
	}
}
