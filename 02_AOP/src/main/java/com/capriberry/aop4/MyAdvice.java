package com.capriberry.aop4;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAdvice {
	public void customBefore(JoinPoint joinPoint, int val){
		if(val > 5000){
			System.out.println("사전충고 실행");
			
		}
	}
	
	public Object customAround(ProceedingJoinPoint pjp, int val) throws Throwable{
		if(val < 5000){
			System.out.println("주변충고 전처리");
			
		}
		return pjp.proceed();
	}
}
