package com.capriberry.smallmart.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforLoggingAdvice implements MethodBeforeAdvice{

	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("before 처리함");
	}

}
