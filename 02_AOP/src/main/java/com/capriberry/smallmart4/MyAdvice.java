package com.capriberry.smallmart4;

import org.aspectj.lang.JoinPoint;

public class MyAdvice {
	public void beforeAdv(JoinPoint jp){
		System.out.println("사전처리맨");
	}
}
