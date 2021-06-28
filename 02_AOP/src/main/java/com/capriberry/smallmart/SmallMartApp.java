package com.capriberry.smallmart;

import org.springframework.aop.framework.ProxyFactory;

import com.capriberry.smallmart.advice.AfterrLoggingAdvice;
import com.capriberry.smallmart.advice.AroundLoggingAdvice;
import com.capriberry.smallmart.advice.BeforLoggingAdvice;
import com.capriberry.smallmart.advice.ThrowsLoggingAdvice;

public class SmallMartApp {
	public static void main(String[] args) {
		SmallMart target = new SmallMartImpl();

		ProxyFactory factory = new ProxyFactory();

		factory.addAdvice(new AfterrLoggingAdvice());
		factory.addAdvice(new AroundLoggingAdvice());
		factory.addAdvice(new BeforLoggingAdvice());
		factory.addAdvice(new ThrowsLoggingAdvice());

		factory.setTarget(target);

		SmallMart proxy = (SmallMart) factory.getProxy();

		try {
			System.out.println("=======proxy==========");
			proxy.getProducts("칫솔");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
