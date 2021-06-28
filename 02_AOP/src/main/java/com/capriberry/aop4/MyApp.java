package com.capriberry.aop4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String[] args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aop4.xml");
		ctx.getBean("myBean", MyBean.class).run(); // advice
	}
}
