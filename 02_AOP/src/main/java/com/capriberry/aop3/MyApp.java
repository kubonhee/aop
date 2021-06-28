package com.capriberry.aop3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String[] args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my.xml");
		ctx.getBean("myBean1", MyBean.class).run(); // advice
		ctx.getBean("myBean2", MyBean.class).run(); // advisor
	}
}
