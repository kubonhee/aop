package com.capriberry.aop3;

import lombok.Setter;

@Setter
public class MyBean {
	
	private MyDepndency depndency;
	
	public void run(){
		depndency.hello();
		depndency.goodbye();
	}
	
}
