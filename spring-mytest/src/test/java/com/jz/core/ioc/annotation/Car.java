package com.jz.core.ioc.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:/context/car.properties")
public class Car {
	@Value("${car.name}")
	private String name;

	@Autowired
//	@Qualifier("bill")
	private Person person;

	public Car() {
		System.out.println("car is constructing");
	}

	public void init() {
		System.out.println("car is init");
	}

	public void destroy() {
		System.out.println("car is destroy");
	}

	public Car(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Car{" +
				"name='" + name + '\'' +
				", person=" + person +
				'}';
	}
}
