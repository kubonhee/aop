package com.capriberry.smallmart.advice2;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterrLoggingAdvice implements AfterReturningAdvice {

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("after 처리함");

	}

}
