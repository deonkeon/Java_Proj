package inheritance_07.lab14_p314_p137;

public class Tire {
	// 필드
	public int maxRotation; // 최대 회전수(타이어 수명)
	public int accumulatedRotation; // 누적 회전수
	public String location; // 타이어의 위치

	// 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	// 메소드
	public boolean roll() {
		++accumulatedRotation; // 누적 회전수 1증가
		if (accumulatedRotation < maxRotation) {	//펑크가 안났을 때
			System.out.println(location + " Tire 수명: " + 
					(maxRotation - accumulatedRotation) + "회");
			return true;
		} else {	//펑크 났을 때
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
}
