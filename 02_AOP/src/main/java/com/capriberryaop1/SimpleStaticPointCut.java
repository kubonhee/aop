package com.capriberryaop1;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class SimpleStaticPointCut extends StaticMethodMatcherPointcut{

	public boolean matches(Method method, Class<?> targetClass) {
		return method.getName().equals("one") && targetClass == First.class;
	}

}
