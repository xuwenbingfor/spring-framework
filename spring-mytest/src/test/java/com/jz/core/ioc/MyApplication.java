package com.jz.core.ioc;

import com.jz.core.ioc.annotation.MyApplicationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

public class MyApplication {
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

//	public static void main(String[] args) {
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyApplicationConfig.class);
//		Car car = context.getBean(Car.class);
//		System.out.println(car);
//	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyApplicationConfig.class);
		printBeanNames(context);
	}

	private static void printBeanNames(AnnotationConfigApplicationContext context) {
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		Stream.of(beanDefinitionNames).forEach(o -> {
			System.out.println("beanName:" + o);
		});
	}
}
