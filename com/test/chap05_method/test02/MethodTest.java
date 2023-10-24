package com.test.chap05_method.test02;

public class MethodTest {
	
	//매개변수 유무와 반환값 유무에 따른 구분
	
	//public MethodTest() {};
	
	//1. 매개변수 없고, 반환값 없는 메소드
	public void method1() {
		//아무런 값도 반환하지 않고, 메소드 내용만 수행 후 별도 리턴값없이 호출한 메소드로 돌아간다.
		System.out.println("매개변수와 반환값이 둘 다 없는 메소드 입니다.");
		//return; 이 숨겨져 있다.
		//void여도 return은 있다. 다만, 숨겨져있고 JVM이 자동으로 처리해주기 때문에 안보일뿐이다.
		//어떠한 데이터도 없이 main의 해당 메소드로 돌아가서 main의 다음 문장을 실행한다.
		//생성자는 return 자체가 숨겨진 것이 아니라 없는 메소드이다.
	}
	
	//2. 매개변수 없고, 반환값 있는 메소드
	public String method2() {
		
		//타입만 맞추면 연산처리해서 반환값을 줘도 괜찮다.
		return "매개변수가 없지만 반환값이 있는 메소드입니다." + "!!";
		
	}
	
	//3. 매개변수 있고, 반환값 없는 메소드
	public void method3(int num1, int num2) {
		//호출하는 쪽의 괄호에 인자로 넘긴 값을 받기위해 선언하는 것이 매개변수이다.
		//여기서는 int num1, num2;
		//매개변수는 일종의 지역변수로, 선언한 영역 내에서만 사용 가능하다.
		
		int sum = num1 + num2;
		System.out.println("sum : " + sum);
		return;
		//void에서 return은 숨겨져있다.
	}
	//4. 매개변수 있고, 반환값 있는 메소드
	
	public int method4(int num1, int num2) {
		//넘겨 받은 값이 저장된 매개변수를 메소드 내에서 사용할 수 있으며,
		//리턴 값으로 메소드 선언시 지정한 타입과 일치하도록 값을 return 해줘야한다.
		
		int sum = num1 + num2;
		
		return sum;
		//return num1 + num2;
		//반환형만 일치하면 연산해서 리턴줘도 상관없다.
	}

}
