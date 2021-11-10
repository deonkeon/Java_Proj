package object06.singleton;

public class Company {	//싱글톤 : 클래스에서 단 하나의 객체만 생성하도록 구현한 디자인 패턴
	
	private static Company instance = new Company();
			// 객체 생성을 Heap 영역이 아니라 stack 영역에 저장.
			// 싱글톤 객체는 private static 으로 클래스 내부에서 선언, 생성
	
	private Company() {}	// 기본 생성자를 private로 선언한다.
							// 외부 클래스에서 생성자 호출을 못하도록 설정한다.
	
	public static Company getInstatce() {	// 외부에서 객체를 생성할때, 메소드를 호출해서
		if (instance == null) {				// 객체가 생성되도록[리턴] 설정
			instance = new Company();		// 메소드는 static 키가 설정이 되어 있어야 외부에서 
											// 외부에서 객체 생성없이 클래스이름으로 호출가능
		}
		return instance;
	}
}

// P 244 : singleton ( Singleton,java, SingletonExampel.java)
