package com.test.chap04_constructor;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		
		User u1 = new User();//기본 생성자를 이용해 User라는 객체를 생성.
		u1.information();
		//별도로 초기화한 것이 없기 때문에 지정된 기본값인 null을 출력한다.
		
		//Public User(String userId, String userPwd, String userName)
		User u2 = new User("user01", "pass01", "이창진");
		//User 클래스보다 메인이 먼저 실행되면서 User 객체를 만들고,
		//매개변수 있는 생성자에 입력된 값들이 User클래스의 해당 생성자로 넘어간다.(복사된다.)
		//이걸 갖고 초기화를 수행한다.
		u2.information();
		
		//매개변수 생성자를 이용하여 객체 생성
		//아래의 생성자를 이용해 객체가 생성될 수 있도록 생성자를 추가
		//실행했을 때 매개변수로 넘겨준 값들로 초기화되는지 확인
		User u3 = new User("user02","pass02","김창진", new Date());
		//따로 stack영역의 주소 변수를 만들지 않고 바로 new Date()해서 할당하면
		//현재 시간 값이 바로 heap 영역에 저장되어서
		//User 클래스의 매개변수로 값을 넘겨준 것인지?
		//Date설명에 객체(object)를 만들고 초기화한다고 되어있어서 추측한 것임.
		u3.information();
		
	}

}
