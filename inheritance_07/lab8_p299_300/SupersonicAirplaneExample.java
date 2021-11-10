package inheritance_07.lab8_p299_300;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly();			// 오버라이딩 된 fly()를 호출
		sa.flyMode = SupersonicAirplane.SUPERSONIC;		// 클래스이름으로 호출 (static) - 클래스 변수
		sa.fly();			// 오버라이딩 된 fly()를 호출
		sa.flyMode = SupersonicAirplane.NORMAL;			// 클래스이름으로 호출 (static)
		sa.fly();			// 오버라이딩 된 fly()를 호출
		sa.land();
	}

}
