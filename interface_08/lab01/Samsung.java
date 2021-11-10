package interface_08.lab01;

public class Samsung implements Phone1{		//implements : 인터페이스를 구현하는 클래스

	@Override
	public void sendcall() {				// 추상 메소드 구현 (오버라이딩)
		System.out.println("전화를 겁니다.");	// 구현하는 클래스에서 public 접근제어자 생략하면 오류 발생
	}

	@Override
	public void receivecall() {				// 추상 메소드 구현 (오버라이딩)
		System.out.println("전화를 받습니다.");	
	}
	
	public void flash() {					// 메소드를 추가 작성
		System.out.println("전화기에 불이 켜졌습니다.");
	}
	
	@Override
	public void printLogo() {
		System.out.println(" Samsung ");
	}
	
}

