package com.capriberry.smallmart2;

import java.lang.reflect.Method;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

import com.capriberry.smallmart.advice.AfterrLoggingAdvice;
import com.capriberry.smallmart.advice.AroundLoggingAdvice;
import com.capriberry.smallmart.advice.BeforLoggingAdvice;
import com.capriberry.smallmart.advice.ThrowsLoggingAdvice;

public class SmallMartApp {
	public static void main(String[] args) {
		
		//대상 객체 생성
		SmallMart target = new SmallMartImpl();
		
		// 프록시팩토리 객체 생성
		ProxyFactory factory = new ProxyFactory();
		
		// 충고 추가
		factory.addAdvisor(new DefaultPointcutAdvisor(new StaticMethodMatcherPointcut() {
			
			public boolean matches(Method method, Class<?> targetClass) {
				// TODO Auto-generated method stub
				return method.getName().endsWith("2");
			}
		}, new AfterrLoggingAdvice()));
		// 대상 설정
		factory.setTarget(target);
		
		// 프록시 객체 생성 (SmallMart 타입)

		SmallMart proxy = (SmallMart) factory.getProxy();

		try {
			System.out.println("=======proxy==========");
			proxy.getProducts1("칫솔");
			proxy.getProducts2("치실");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
