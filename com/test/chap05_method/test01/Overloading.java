package com.test.chap05_method.test01;

public class Overloading {
	
	/* 오버로딩
	 * 메소드명은 동일하지만, 매개변수의 타입이나 개수가 반드시 하나는 달라야한다.
	 * 반환형이 다른건 오버로딩과 상관없다.
	 */
	public int test() {//반환형을 int로 지정.
		
		return 0;//리턴 값은 반드시 정수 값 또는 정수 값을 가진 변수 하나만 리턴.
		
	}
	
	public int test(int a) {
		
		return 0;
		
	}
	
	public int test(int a, int b) {
		
		return 0;
		
	}
	
	//매개변수명 상관없이 자료형의 개수와 자료형의 타입 또는 서로 다른 자료형의 순서가 달라야한다.
	//동일한 자료형은 매개변수명 순서만 바꿨어도 int 타입이 2개인게 있으므로 오버로딩 불가능.
	/*
	public int test(int b, int a) {
		
		
		return 0;
	}
	*/
	
	//서로 다른 자료형의 순서를 바꾼 것은 오버로딩 가능하다.
	//반환형은 오버로딩과 관련없다.(달라도 상관 없다.)
	public void test(int a, String c) {
		
	}
	//서로 다른 자료형의 순서를 바꾼 것은 오버로딩 가능하다.
	//int, String / String, int 는 서로 다른 것 인식한다.
	//같은 자료형을 순서 바꾼 것은 오버로딩 불가하다.
	//null 값도 반환 가능하다.
	//반환형은 오버로딩과 관련없다.
	public String test(String s, int a) {
		
		return null;
		
	}
	
	//접근제한자가 다른 것도 오버로딩과 상관없다.
	private void test(String h, boolean x) {
		
	}
	//접근제한자가 다른 것도 오버로딩과 상관없다.
	public void test(boolean x, String h) {
		
	}
	//드래그하고 ctrl + / -> 드래그 범위 // 주석 처리
	//드래그하고 ctrl + shift + / => 드래그 범위 /* 주석 처리
	
	
	
	
	
	

}
