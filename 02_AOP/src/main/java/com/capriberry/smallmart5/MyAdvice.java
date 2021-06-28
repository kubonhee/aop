package com.capriberry.smallmart5;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;


@Aspect @Service
public class MyAdvice {
	@Before("execution(* *2(..))")
	public void beforeAdv(JoinPoint jp){
		System.out.println("사전처리맨");
		
		
	}
}
