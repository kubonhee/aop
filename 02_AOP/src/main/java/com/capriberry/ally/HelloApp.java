package com.capriberry.ally;

import org.springframework.aop.framework.ProxyFactory;

public class HelloApp {
	public static void main(String[] args){
		HelloWorldService origin = new HelloWorld();
		
		ProxyFactory pf = new ProxyFactory();
		pf.addAdvice(new MsgDeco());
		pf.setTarget(origin);
		
		HelloWorldService proxy = (HelloWorld) pf.getProxy();
		
		System.out.println("========= origin ==========");
		origin.sayHello();
		System.out.println("========= proxy ==========");
		proxy.sayHello(); // 어떤 객체가 필요한데?
		
		System.out.println(origin);
		System.out.println(proxy);

		
	}
}
