package com.capriberry.smallmart5;

import org.springframework.stereotype.Service;

@Service("smallMart")
public class SmallMartImpl implements SmallMart {

	public void getProducts1(String productName) throws Exception {
		System.out.println(productName+":: getProducts1");
//		throw new Exception("small mart 예외");
	}
	public void getProducts2(String productName) throws Exception {
		System.out.println(productName+ ":: getProducts2 ");
	}
	
}
