package com.jz.core.ioc.annotation;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class PersonImportSelector implements ImportSelector {
	/**
	 * @param importingClassMetadata 当前@Import标注类的所有注解信息
	 * @return 需要注册为bean的类全类名
	 */
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{"com.jz.core.ioc.annotation.Person"};
	}
}
