package inheritance_07.abstract_ex;

public class Desktop extends Computer { //콘크리트 클래스 : 추상클래스의 메소드를 구현한 클래스

	//=================추상 메소드 재정의 (오버라이딩)=====================
	@Override
	public void display() {
		System.out.println("데스크탑 모니터");
	}

	@Override
	public void typing() {
		System.out.println("데스크탑 타이핑");
	}

	//====================일반 메소드 재정의=========================
	@Override
	public void turnOn() {
		super.turnOn();
		System.out.println("데스크탑 컴퓨터 켭니다. ");
	}
	@Override
	public void turnOff() {
		super.turnOff();
		System.out.println("데스크탑 컴퓨터 끕니다. ");
		
	}
	
	public void desktoponly () {
		System.out.println("데스크탑에 존재하는 메소드 - desketopOnly");
	}
}
