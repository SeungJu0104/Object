package com.test.chap04_constructor;

import java.util.Date;

//생성자
//1. 객체를 생성해주기 위해 사용.
//2. 매개변수를 통해 전달받은 값으로 필드를 초기화.
	
//생성자 사용 시 주의사항
//1. 반드시 클래스명과 동일하게 생성(대/소문자 구분)
//2. 리턴타입이 없다.(void, int, char 등)
//	 그래서 접근제한자 클래스명 (매개변수) { } 의 형태로 사용.

public class User {
	private String userId;
	private String userPwd;
	private String userName;
	private Date date;//java.util.Date import해 사용.
	
	//기본생성자 : 필드 초기화 역할은 수행하지 못하고 객체만 생성할 때 사용한다.
	//			 굳이 하지면 { }안에 값을 넣어 초기화는 가능은 하다.
	//접근제한자 클래스명 () {}
	public User() {}
	/*
	public User() {
		this.userId = "user01";
		this.userPwd = "pass01";
	} //이런 방식으로 굳이 초기화는 가능.
	*/
	
	//매개변수 있는 생성자 : 객체 생성과 필드를 초기화하는 두가지 목적으로 사용한다.
	//접근제한자 클래스명 (매개변수) {필드 초기화}
	//매개변수 있는 생성자를 작성하면, 반드시 먼저 기본 생성자를 작성해야한다.
	//지역변수와 필드의 이름이 동일하면 지역변수가 우선시 되므로 필드와 지역변수 구분을 위해 this. 을 명시한다.
	//this. 는 숨겨진 채 존재하는 레퍼런스 변수. 할당된 객체 자신을 의미한다.
	
	public User(String userId, String userPwd, String userName) {
		
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		
	}
	
	public User(String userId, String userPwd, String userName, Date date) {
		
		//this.userId = userId;
		//this.userPwd = userPwd;
		//this.userName = userName;
		
		//중복되는 동일한 초기화 내용의 생성자가 존재하는 경우 this()를 이용해 사용 가능.
		//this()는 가장 첫 줄에 선언해야한다.
		this(userId, userPwd,userName);//한 생성자 내에서 다른 생성자 호출 가능하다.
		this.date = date;
		
	}
	
	//저장된 필드값 출력용 메소드
	public void information() {
		
		System.out.println(userId + ", " + userPwd + ", " + userName + ", " + date);
		
	}
	
	
	

}
