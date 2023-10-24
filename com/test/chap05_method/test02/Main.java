package com.test.chap05_method.test02;

public class Main {

	public static void main(String[] args) {
		
		MethodTest test = new MethodTest();
		//[매개변수와 반환값이 없는 메소드 호출]
		test.method1();
		
		//[매개변수가 없고, 반환값이 있는 메소드 호출]
		//1. 메소드의 리턴 타입과 일치하는 자료형의 변수에 리턴값을 담아 사용.
		String res = test.method2();
		System.out.println(res);
		
		//2. 리턴값을 바로 사용
		System.out.println(test.method2());
		//반환된 String 값이 출력문을 통해 바로 출력된다.
		
		//[매개변수 있고, 반환값이 없는 메소드 호출]
		test.method3(10, 20);
		//void기 때문에 빈 값이 리턴된다.
		//void도 리턴은 있다. 숨겨져서 JVM이 자동으로 넘겼을 뿐이다.
		
		//[매개변수와 반환값이 있는 메소드 호출]
		//1. 메소드의 리턴 타입과 일치하는 자료형의 변수에 리턴값을 담아 사용.
		int res2 = test.method4(10, 40);
		System.out.println(res2);
		
		//2. 리턴값을 바로 사용
		System.out.println(test.method4(10, 40));
		//반환된 int 값이 출력문을 통해 바로 출력된다.
		
	}

}
