package inheritance_07.lab6_super_error;

public class A {	// 기본 생성자를 명시하지 않아서 오류난 경우
	
	public A () {	// 하위 클래스에서 호출할 경우? 반드시 명시
		System.out.println("생성자 A");
	}
	public A (int x) {
		System.out.println("매개변수 생성자 A : " + x);
	}
	
}
