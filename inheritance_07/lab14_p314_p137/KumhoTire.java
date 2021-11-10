package inheritance_07.lab14_p314_p137;

public class KumhoTire extends Tire {
	//필드
	//생성자
	public KumhoTire (String location, int maxRotation) {
		super(location, maxRotation);
	}
	//메소드
	@Override
	public boolean roll() {
		++accumulatedRotation; 
		if (accumulatedRotation < maxRotation) {		//펑크가 안났을 때
			System.out.println(location + " KumhoTire 수명: " + 
					(maxRotation - accumulatedRotation) + "회");
			return true;
		} else {	//펑크가 났을 때
			System.out.println("*** " + location + " KumhoTire 펑크 ***");
			return false;
		}
	}
}
