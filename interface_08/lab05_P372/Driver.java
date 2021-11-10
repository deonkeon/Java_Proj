package interface_08.lab05_P372;

public class Driver {	//매개 변수의 인터페이스화
	public void drive(Vehicle vehicle) {	//업캐스팅
		vehicle.run();
	}
}
