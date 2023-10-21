package com.test.chap03_field.test02;

public class Main {

	public static void main(String[] args) {
		
		InitBlock p = new InitBlock(); //기본생성자로 객체 생성
		p.information();
		
		InitBlock p2 = new InitBlock("z플립", 200000, "samsung");
		p2.information();
		
		p.information();//브랜드 값이 samsung으로 바뀐다.
		//p2를 실행하면서 static 필드의 값이 samsung으로 바뀌었기때문에
		//static 필드는 변경하면 변경된 값이 다른 곳에도 출력되므로
		//samsung이 나온다.
		
	}

}
