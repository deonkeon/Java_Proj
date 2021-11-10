package object06.hide.package1_1;

public class A {
	//필드
	A a1 = new A(true);		// (o)
	A a2 = new A(1);		// (o)
	A a3 = new A("문자열");	// (o)
	
	//생성자
	public A(boolean b) {}   // <== public 접근 제한
	A(int b){}				// <== default 접근 제한				
	private A(String s) {}	// <== private 접근 제한

	
	//================================================================
	
	
	//필드
	public int field1;		// public 접근 제한
	int field2;				// default 접근 제한
	private int field3;		// private 접근 제한
	
	//생성자
	public A() {
		field1 = 1;		// (o)
		field2 = 1;		// (o)
		field3 = 1;		// (o)
											// <== 클래스 내부일 경우 접근 제한자의 영향을 받지 않는다.
		method1();		// (o)
		method2();		// (o)
		method3();		// (o)
	}
	
	//메소드
	public void method1() {}	   // <== public 접근 제한
	void method2() {}				// <== default 접근 제한
	private void method3() {}		// <== private 접근 제한
}

