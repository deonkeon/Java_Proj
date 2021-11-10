package inheritance_07.abstract_ex;

public abstract class Computer { // 추상 클래스 : 클래스 내부에 추상 메소드가 1개 이상 존재하면, 추상 클래스를 선언해야함.
	// 추상 클래스 : 추상 메소드를 정의한 클래스
	// 추상 클래스는 객체화 할 수 없다.
	// 추상 클래스는 추상메소드를 구현하는 클래스가 존재(상속, 오버라이딩)

	public abstract void display(); // 추상 메소드 : 실행부가 없는 메소드, 선언만 되어있는 메소드
	// 반드시 자식클래스에서 메소드 오버라이딩을 통해서 구현.
	// 메소드 이름 규칙을 만듦

	public void display2() {
	} // 일반 메소드 ==> () : 매개변수 인풋, {} : 실행부

	public abstract void typing();

	public void turnOn() { // 일반 메소드
		System.out.println("전원을 켭니다. ");
	}

	public void turnOff () {	//일반 메소드
		System.out.println("전원을 끕니다. ");
	}	


}
