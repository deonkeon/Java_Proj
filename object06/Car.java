package object06;

public class Car {
	String company = "현대 자동차";
	String model;
	String color;
	int maxspeed;
	
	Car() {}

	Car(String model){	// 인풋매개변수 이름, 할당하는 변수이름, 맴버변수에 접근함. 
		this.model = model; //this.model = String model / model = 생성자 모델
	}
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	Car(String model, String color, int maxspeed){
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	}	
}
