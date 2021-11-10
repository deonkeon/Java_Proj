package object06;

public class CarExample {	// 생성자 오버로딩 : 같은 이름의 생성자에서 input값에 따라 다르게 호출

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1.company : " + car1.company);
		System.out.println();

		Car car2 = new Car("자가용");
		System.out.println("car1.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();

		Car car3 = new Car("자가용", "빨강");
		System.out.println("car3.company:" + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();

		Car car4 = new Car("택시", "검정", 200);
		System.out.println("car4.company:" + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxspeed : " + car4.maxspeed);
		System.out.println();
	}

}
