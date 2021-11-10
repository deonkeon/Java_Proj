package inheritance_07.lab5_super;

public class A {	// super() : 상위 클래스에 생성자 호출

	public A () {
		System.out.println("생성자 A");
	}
	
	public A (int x) {
		System.out.println("매개변수 생성자 A : " + x);
	}
}
