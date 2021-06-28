package com.capriberry.smallmart.advice;

import org.aopalliance.intercept.MethodInvocation;

public class AroundLoggingAdvice implements org.aopalliance.intercept.MethodInterceptor{

	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("around before 처리함");
		Object obj = invocation.proceed();
		System.out.println("around after 처리함");
		return obj;
	}

}
