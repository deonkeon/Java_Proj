package inheritance_07.abstract_template;

public abstract class Car {		//추상 클래스

	public abstract void drive();		//추상메소드 : 선언만되어있으며, 하위 자식클래스에 재정의해서 사용해야함.
	public abstract void stop();		//추상메소드, 하위 클래스에서 오버라이딩
	public void startCar () {
		System.out.println("시동을 켭니다. ");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다. ");
	}
	final public void run() {	//템플릿 메소드 : 하위 클래스에서 오버라이딩(재정의) 불가.
								//프로그램의 로직을 사용.(순환구조)
		startCar();
		drive();
		stop();
		turnOff();
	}
}
