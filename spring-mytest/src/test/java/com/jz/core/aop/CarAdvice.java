package com.jz.core.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class CarAdvice {
	public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("-----doAround().invoke-----");

		//调用核心逻辑
		Object retVal = pjp.proceed();

		System.out.println("-----End of doAround()------");
		return retVal;
	}
}
