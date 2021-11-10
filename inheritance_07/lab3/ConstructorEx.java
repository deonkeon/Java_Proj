package inheritance_07.lab3;

public class ConstructorEx {

	public static void main(String[] args) {
		
		B b;			// 객체 변수 선언
		b = new B();	// 객체 생성(c)
		// C c - new C();	// 객체를 선언과 동시에 생성
		// A가 최상위 클래스임. 상속받은 자식클래스보다 부모클래스가 먼저 객체가 형성되므로
		// A-B-C 순서로 객체가 만들어지면서 부모클래스부터 출력이됌.

		
	}
}
