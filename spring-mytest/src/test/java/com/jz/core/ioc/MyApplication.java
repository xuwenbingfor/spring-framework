package com.jz.core.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.stream.Stream;

public class MyApplication {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:context/applicationContext.xml");
		Hello hello = (Hello) ac.getBean("hello");
		hello.hello();
		ac.publishEvent(new ContextRefreshedEvent(ac));
	}
/*	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:context/applicationContext.xml");
		Hello hello = (Hello) ac.getBean("hello");
		hello.hello();
		System.out.println(hello.getName());
	}*/

/*	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyApplicationConfig.class);
		Person person1 = (Person) context.getBean("person");
		Person person2 = (Person) context.getBean("person");
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());

//		Car car = context.getBean(Car.class);
//		System.out.println(car);
	}*/

/*	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyApplicationConfig.class);
		System.out.println("ioc init finish");
		Person person1 = (Person) context.getBean("person");
		System.out.println(person1.hashCode());
		Person person2 = (Person) context.getBean("person");
		System.out.println(person2.hashCode());
	}*/

/*	public static void main(String[] args) {
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyApplicationConfig.class);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("dev");
		context.register(MyApplicationConfig.class);
		context.refresh();
		Car car = context.getBean(Car.class);
		System.out.println(car);
//		ConfigurableEnvironment environment = context.getEnvironment();
//		System.out.println(environment.getProperty("car.name"));
	}*/

/*	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyApplicationConfig.class);
		printBeanNames(context);
		context.close();
	}*/

	private static void printBeanNames(AnnotationConfigApplicationContext context) {
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		Stream.of(beanDefinitionNames).forEach(o -> {
			System.out.println("beanName:" + o);
		});
	}
}
