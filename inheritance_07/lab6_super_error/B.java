package inheritance_07.lab6_super_error;

public class B extends A {

	public B () {		//오류 발생, 상위 클래스에서 매개변수 없는 생성자가 명시되어있지 않음.
		//super(); // <== 생략되어 있음. 상속 기본 생성자
		
		System.out.println("생성자 B");
	}
	
}
