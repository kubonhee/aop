package com.capriberry.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class HelloWorldHandler implements InvocationHandler{

	private Object target;
	
	public HelloWorldHandler(Object target) {
		this.target = target;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("invoke prev :: " + method.getName());
		Object ret = method.invoke(target, args);
		System.out.println("invoke next :: " + method.getName());
		return ret;
	}
	
}
