package inheritance_07.lab8_p299_300;

public class SupersonicAirplane extends Airplane{
	public static final int NORMAL = 1;		// Stack 영역에 저장되는 상수
	public static final int SUPERSONIC = 2;	// Stack 영역에 저장되는 상수
	
	public int flyMode = NORMAL;
	
	@Override		// 어노테이션, @Override : 메소드 재정의 할 때 오류를 방지하기 위해서 사용.
					// 메소드 재의의[오버라이딩] : 부모 클래스의 데이터 타입, 매개변수 갯수, 순서 동일해야 가능.
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초움속비행합니다.");
		} else {
			//Airplane 객체의 fly() 메소드 호출
			super.fly();	//상위 클래스의 fly()
		}
	}
}
