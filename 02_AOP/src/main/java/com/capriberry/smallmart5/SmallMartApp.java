package com.capriberry.smallmart5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SmallMartApp {
	@Autowired
	SmallMart mart;
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("smallmart5.xml");
		SmallMart proxy = ctx.getBean("smallMart", SmallMart.class);
		
		try{
			System.out.println("====proxy====");
			proxy.getProducts1("칫솔");
			proxy.getProducts2("칫솔");
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
