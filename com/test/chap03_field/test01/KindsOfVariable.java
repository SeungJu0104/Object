package com.test.chap03_field.test01;

//변수 선언위치에 따른 구분
public class KindsOfVariable {//클래스 영역의 시작
	//클래스 영역에 작성하는 변수 필드
	//필드 == 멤버변수(클래스가 가지는 멤버) == 전역변수(클래스 전역에서 사용할 수 있는 변수)
	//static -> main -> 각 클래스 순으로 자바 작동.
	private int globalNum;
	
	public void testMethod(int num) {//메소드영역의 시작
		//메소드 영역에서 작성하는 변수 필드
		//지역변수
		//지역변수는 선언 외에 사용하기위해서는 내부에서 반드시 초기화가 되어야한다.
		//메소드의 괄호() 안에 선언하는 변수
		//매개변수(일종의 지역변수)
		//매개변수는 메소드 외부의 값을 받아오는 변수이기 때문에 내부에서 초기화할 필요가 없다.
		
		int localnum;
		
		//지역변수는 선언 외에 사용하기위해서는 내부에서 반드시 초기화가 되어야한다.
		{ localnum = 1; }//인스턴스 블럭을 사용한 초기화
		System.out.println(localnum);
		
		//매개변수는 호출 시 값이 넘어와서 변경되기 때문에 초기화가 필요 없다.
		System.out.println(num);
		
		//필드(전역변수)는 클래스 전역에서 사용가능하다.
		System.out.println(globalNum);
		
	}//메소드 영역의 끝
	
	public void testMethod2() {
		
		System.out.println(globalNum);
		//전역변수는 다른 메소드에서도 사용 가능.
		//System.out.println(localnum);//localnum은 testMethod1에 있다.
		//지역변수는 해당 지역(블럭, 영역)에서만 사용 가능.
		
	}
	
}
//클래스 영역의 끝
