package com.test.chap01_encapsulation;

public class Account {
	//캡슐화 : 추상화를 통해 정리한 데이터들과 기능을 하나로 묶어 관리하는 기법. 이를 위해 사용하는 것이 접근제한이다.
			//(접근제한 != 캡슐화)
	//필드(멤버변수)
	/* public (+) : 어디에서나 접근 가능
	 * protected (#) : 동일 패키지 또는 상속 관계만 접근 가능
	 * default : 동일 패키지 접근 가능
	 * private (-) : 동일 클래스에서만 접근 가능 
	 */
	private String name = "이창진";
	private String accNo = "01012345678";
	private String pwd = "1234";
	private int bankCode = 20;
	private int balance = 0;
	
	//메소드(멤버함수)
	
	//생성자(객체를 생성하기 위한 일종의 메소드. 생성자는 메소드이다. 필드를 초기화하는 역할을 한다.)
	public Account() {}
	
	//입금 메소드
	public void in(int money) {
		
		if(money > 0) {
			
			balance += money;
			System.out.println(name + "의 계좌에 " + money + "원이 입금되었습니다.");
			
		}
		
		else {
			
			System.out.println("잘못된 금액이 입금 되었습니다.");
			
		}
		
	}
	
	//출금 메소드
	public void out(int money) {
		
		if(money < balance) {
			
			balance -= money;
			System.out.println(name + "님의 계좌에서 " + money + "원이 출금 되었습니다.");
			
		}
		
		else {
			
			System.out.println("잔액이 부족합니다.");
			
		}
		
	}
	
	//잔액 조회 메소드
	public void prnBalance() {
		
		System.out.println(name  + "님의 계좌에 잔액은 " + balance + "원 입니다.");
		
	}

}
