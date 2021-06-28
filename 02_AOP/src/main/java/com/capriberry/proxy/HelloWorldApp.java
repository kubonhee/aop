package com.capriberry.proxy;

import java.lang.reflect.Proxy;

public class HelloWorldApp {
	public static void main(String[] arhs) {
		Class<?>[] arrClass = {HelloWold.class};
		HelloWorldHandler handler = new HelloWorldHandler(new HelloworldImpl());
		
		HelloWold origin = new HelloworldImpl();
		HelloWold proxy = (HelloWold) Proxy.newProxyInstance(
				HelloWold.class.getClassLoader(), arrClass, handler);
		
		
		System.out.println("========= origin ==========");
		System.out.println(origin.sayHello());
		System.out.println("========= proxy ==========");
		System.out.println(proxy.sayHello());
		
		System.out.println(origin);
		System.out.println(proxy);
		
		// 1. 인터페이스를 통한 자동 프록시 객체 생성
		// 2. 상속을 통한 자동 프록시 객체 생성
	}
}
