package com.jz.core.ioc.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.jz.core.ioc.annotation")
//@Import(Person.class)
//@Import(PersonImportSelector.class)
@Import(PersonImportBeanDefinitionRegistrar.class)
public class MyApplicationConfig {
/*	@Bean
//	@Scope("prototype")
	@Lazy
	public Person person() {
		System.out.println("bean is generating");
		return new Person("xuwenbing", 27);
	}*/

/*	@Bean("bill")
	public Person person1() {
		return new Person("bill", 60);
	}

	@Bean("linus")
	@Conditional({PersonCondition.class})
	public Person person2() {
		return new Person("linus", 30);
	}*/
}
