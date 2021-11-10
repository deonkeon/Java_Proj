package generic_12.restrict;

public abstract class Material {		// 추상 클래스, 제네릭에서 특정 데이터타입만 사용하도록 제한 설정
										// 추상 클래스를 상속하는 재료만 데이터 타입을 사용
	public abstract void doPrinting();	// 추상 메소드
}
