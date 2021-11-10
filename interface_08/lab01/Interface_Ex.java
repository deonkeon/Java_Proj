package interface_08.lab01;

public class Interface_Ex {

	public static void main(String[] args) {
		Samsung sam = new Samsung();
		
		sam.printLogo();		//default 메소드 호출 : 인터페이스에서 구현 코드가 적용된 메소드
		sam.sendcall();
		sam.receivecall();
		sam.flash();			//SamsungPhone에만 존재하는 메소드
		
		System.out.println("======================");
		//인터페이스는 객체 생성 불가
		//Phone1 p = new Phone1();  오류발생, 인터페이스는 인스턴스화가 불가	
		Phone1 p = new Samsung(); //타입변환은 가능 (업캐스팅)
		p.printLogo();		// default 메소드
		p.sendcall();		// 오버라이딩
		p.receivecall();	// 오버라이딩
		Samsung sp = (Samsung) p;		// 다운 캐스팅
		sp.flash();
		
	}///main
}///////class


