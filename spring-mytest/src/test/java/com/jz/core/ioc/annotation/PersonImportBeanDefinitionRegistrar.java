package com.jz.core.ioc.annotation;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class PersonImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		boolean containsCar = registry.containsBeanDefinition("car");
		if (containsCar) {
			RootBeanDefinition personBeanDefinition = new RootBeanDefinition(Person.class);
			registry.registerBeanDefinition("powerPerson", personBeanDefinition);
		}
	}
}
