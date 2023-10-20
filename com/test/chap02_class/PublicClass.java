package com.test.chap02_class;

//[클래스 접근제한자]
//default : 동일 패키지 내에서만 접근 가능. 접근제한자를 작성하지 않으면 default를 의미한다.
//public : 어디서든 접근 가능.

public class PublicClass {
	
	public void test() {
		
		System.out.println("public 클래스의 test() 호출...");
		
	}
	
	
	

}
