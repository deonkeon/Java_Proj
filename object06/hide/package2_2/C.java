package object06.hide.package2_2;		// <== 패키지가 다름

import object06.hide.package1_1.A;

public class C {

	// P. 261 : 생성자 접근제한 실습 ( A, B, C )
	// P. 263 : 필드와 메소드 접근 제한 실습 ( A, B, C)
	// P. 267 : getter , setter 실습 (Car, CarExample)
	
	//필드
	A a1 = new A(true);		// (o)
	//A a2 = new A(1);		// (X)			//<== default 생성자 접근 불가(컴파일 에러)
	//A a3 = new A("문자열");	// (X)			//<== private 생성자 접근 불가(컴파일 에러)
	
	public C() {
		A a = new A();
		a.field1 = 1;		// (o)
		//a.field2 = 1;		// (X)			//<== default 필드 접근 불가(컴파일 에러)
		//a.field3 = 1;		// (X)			//<== private 필드 접근 불가(컴파일 에러)

		a.method1();		// (o)
		//a.method2();		// (x)			//<== default 메소드 접근 불가(컴파일 에러)
		//a.method3();		// (x)			//<== private 메소드 접근 불가(컴파일 에러)
		
	}
	
}
