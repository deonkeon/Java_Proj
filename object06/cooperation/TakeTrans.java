package object06.cooperation;
public class TakeTrans {
	public static void main(String[] args) {
		// 학생 두명을 생성 해서 버스와 지하철 탑승
		Student studentLee = new Student ();	// 기본 생성자 호출
		Student studentJames = new Student ("James", 5000); // 제임스 학생 객체 생성, 객체형 변수
		Student studentTomas = new Student ("Tomas", 10000); // 토마스 학생의 객체 생성
		Student studentKim =new Student ("Kim", 20000);
		
		Bus bus100 = new Bus (100);
		studentJames.takeBus(bus100);    // James 가 100번 버스를 탐
		studentJames.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2호선");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();
		subwayGreen.showInfo();		
		
		studentKim.takeBus(bus100);
		studentKim.takeSubway(subwayGreen);
		studentKim.showInfo();
		bus100.showInfo();
		subwayGreen.showInfo();
	}
}
