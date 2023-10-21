package com.test.chap03_field.test02;

public class InitBlock {
	
	//기존에 객체에 연결방법? 배열의 얕은복사처럼 주소값만 공유하게. new쓰면 새로운 객체가 생성되니깐
	//static -> main -> 각 클래스 순으로 자바 작동.
	
	//1. 지정된 기본값으로 초기화
	//private String pName;
	//private int price;
	//private static String brand;
	
	//2. 명시적 초기화
	private String pName = "갤럭시 S23";
	private int price = 1200000;
	private static String brand = "삼성";
	
	public void information() {
		
		//외부에서 접근이 불가능한 필드(private 선언)에 저장된 데이터 확인용 메소드.
		System.out.println(pName + ", " + price + ", " + brand);
		
		//1.지정된 기본값으로 초기화
		//메인에서 p의 객체에 있는 pName, price를 불러오고, static영역에 있는 brand를 불러온다.
		//stack외의 heap, static영역에는 값이 빈 채로 공간을 생성할 수 없기 때문에 지정된 기본값을 넣어 공간을 생성한다.
		//그래서 메인을 돌리면 지정된 기본값이 출력되는 것이다.
		
		//2. 명시적 초기화
		//직접 값을 넣어 초기화
		
	}
	
	//3. 초기화 블럭
	//static은 프로그램 시작부터 동작한다.
	static {
		//static초기화 블럭에서는 non static 필드를 초기화 할 수 없다.
		//pName = "iPhone 15";
		//price = 1500000;
		brand = "애플";
	}
	//인스턴스 초기화 블럭
	//객체 생성될 때 실행된다.
	//static은 시작부터 동작하고, 인스턴스 초기화는 객체 생성 후 실행되므로 인스턴스 초기화를 이용해 덮어씌울 수 있다.
	{
		//인스턴스 초기화 블럭에서는 static 필드 초기화 가능하다.
		pName = "iPhone 15";
		price = 1500000;
		brand = "Apple";
		
	}
	
	
	//4. 매개변수가 있는 초기화
	//	 전달받은 값으로 필드를 초기화한다.
	public InitBlock() {} //기본 생성자
	//매개변수 생성자를 사용하면 반드시 기본 생성자를 먼저 작성해줘야한다.
	//따로 매개변수 생성자를 작성 안하면 JVM이 자동으로 기본 생성자를 만들어줬으나, 따로 작성했을 경우는 반드시 기본 생성자를 작성해야 작동한다.
	
	public InitBlock(String pName, int price, String brand) {//매개변수 생성자
	//자료형과 순서를 맞춰서 값을 적으면, 매개변수로 각각의 값이 넘어가 필요한 연산을 수행한다.
	//매개변수의 값을 바꾼다고 원본 값이 바뀌는 것은 아니다.(값만 매개변수에 복사하는 개념)
	//매개변수의 이름은 원래 변수와 이름이 달라도 전혀 상관없다.(윗 문장 때문에)
	//this 사용 시 매개변수가 우선된다.
		
		this.pName = pName;//non static필드 이기에 해당 객체를 의미하는 this로 필드에 접근한다.
		this.price = price;//
		InitBlock.brand = brand;//static 필드이기에 클래스명으로 접근한다.
		
	}
	
	
}
