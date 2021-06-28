package com.capriberry.aop4;

import lombok.Setter;

@Setter
public class MyBean {
	
	private MyDepndency depndency;
	
	public void run(){
		depndency.hello(5200);
		depndency.hello(4800);
		depndency.goodbye();
	}
	
}
