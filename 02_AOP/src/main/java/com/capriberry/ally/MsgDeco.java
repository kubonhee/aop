package com.capriberry.ally;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MsgDeco implements MethodInterceptor{

	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object obj = invocation.proceed();
		System.out.println("세상");
		return null;
	}
	
}
