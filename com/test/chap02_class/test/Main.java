package com.test.chap02_class.test;

import com.test.chap02_class.PublicClass;
//패키지를 그냥 임포트하면 안되는가?
//import com.test.chap02_class.DefaultClass;


public class Main {

	public static void main(String[] args) {
		
		PublicClass pc = new PublicClass();
		//DefaultClass dc = new DefaultClass();
		//defaultClass는 default 접근제한자를 사용하고 있으므로 외부 패키지에서는 접근 불가능하다.
		//default 접근제한자는 동일 패키지 내에서만 접근 가능하다.
		
		pc.test();
		//dc.test();

	}

}
