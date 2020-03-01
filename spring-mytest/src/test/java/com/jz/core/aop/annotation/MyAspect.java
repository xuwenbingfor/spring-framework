package com.jz.core.aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
	// 1.通知类型
/*    try{
        try{
            //@Before
            method.invoke(..);
        }finally{
            //@After
        }
        //@AfterReturning
    }catch(){
        //@AfterThrowing
    }*/
	@Around("execution(* com.jz.core.aop.annotation.MyTarget.*(..))")
	public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("around before!");
		//代表执行目标
		Object[] args = proceedingJoinPoint.getArgs();
		for (Object arg : args) {
			System.out.println("arg:" + arg);
		}
		Object result = proceedingJoinPoint.proceed();
		System.out.println("around after!");

		return result;
	}
}
