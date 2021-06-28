package com.capriberry.aop3;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyBefore implements MethodBeforeAdvice{

	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("사전 충고 받으시오 ::" + method);
	}

}
