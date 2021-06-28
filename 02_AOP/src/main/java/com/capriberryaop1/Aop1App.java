package com.capriberryaop1;

import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import com.capriberry.smallmart.advice.AroundLoggingAdvice;

public class Aop1App {
	public static void main(String[] args) {
		First first = new First();
		Second second = new Second();

		System.out.println("========= origin ========");
		first.one();
		first.two();
		second.one();
		second.two();

		// 어드바이저 객체생성
		Advisor advisor = new DefaultPointcutAdvisor(new SimpleStaticPointCut(), new AroundLoggingAdvice());
		// 프록시 팩토리 객체 생성
		ProxyFactory pf = new ProxyFactory();
		// 어드바이저 추가
		pf.addAdvisor(advisor);
		// 타겟 설정
		pf.setTarget(first);
		// 프록시 객체 생성
		First proxy1 = (First) pf.getProxy();

		// 프록시 팩토리 객체 생성
		pf = new ProxyFactory();
		// 어드바이저 추가
		pf.addAdvisor(advisor);
		// 타겟 설정
		pf.setTarget(second);
		// 프록시 객체 생성
		Second proxy2 = (Second) pf.getProxy();

		System.out.println("====== proxy ======");

		proxy1.one();
		proxy1.two();
		proxy2.one();
		proxy2.two();
	}
}
