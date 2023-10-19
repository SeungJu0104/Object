package com.test.chap01_encapsulation;

public class Main {

	public static void main(String[] args) {
		//객체 생성
		Account a = new Account();
		//a라는 레퍼런스 변수를 만들고, 힙 영역에 Account 객체를 만든다. a에는 객체의 주소 값이 들어간다.
		//Account 객체에는 예금주, 계좌번호 등의 멤버변수 값들이 들어가 있다.
		
		Account b = new Account();
		//b라는 레퍼런스 변수를 만들고, 힙 영역에 Account 객체를 만든다. b에는 객체의 주소 값이 들어간다.
		//위의 Account 객체와는 다른 새로운 Account 객체가 heap 영역에 생성된다.
		//a라는 레퍼런스 변수와 전혀 관계없는 새로운 공간이다.
		
		//동일 클래스(빵틀)로 만들어낸 객체(빵)들이지만 서로 다른 빵이다.
		
		//a 잔액 조회
		a.prnBalance();
		
		//a 입금
		a.in(10000);
		a.prnBalance();
		
		a.in(15000);
		a.prnBalance();
		
		//a 출금
		a.out(5000);
		a.prnBalance();
		
		//b 잔액 조회
		b.prnBalance();//a의 잔액은 2만원인데, b 객체는 별개이므로 b의 잔액은 0원이 나온다.
		
		//b 입금
		b.in(500000);
		
		//b 출금
		b.out(100000);
		
		//멤버변수에 직접 접근
		//(실행 당시에는 default 접근제한자를 사용했다. -> 외부에서 직접 접근 가능)
		//(멤버 변수들을 private로 접근제한자를 변경한 후 외부에서 직접 접근 불가능 -> 에러 발생)
		//a.balance -= 20000;
		
		//a 출금
		a.out(15000);
		
		//a 잔액
		a.prnBalance();
		
	}

}
