package object06.hide.package1_1;		//<== 패키지가 동일

public class B {
	//필드
	A a1 = new A(true);		// (o)
	A a2 = new A(1);		// (o)
	//A a3 = new A("문자열");	// (x)		//<== private 생성자 접근 불가(컴파일 에러)
	
	public B() { 
		A a = new A();
		a.field1 = 1;		// (o)
		a.field2 = 2;		// (o)
		//a.field3 = 3;		// (x)		//<== private 필드 접근 불가(컴파일 에러)
		
		a.method1();		// (o)
		a.method2();		// (o)
		//a.method3();		// (o)		//<== private 메소드 접근 불가(컴파일 에러)
	
	}
}
