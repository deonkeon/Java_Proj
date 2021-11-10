package inheritance_07.lab4;

public class CustomerTest1 {	// 기본 생성자 호출, setter를 통해서 값을 넣고 출력

	public static void main(String[] args) {
		Customer customerLee = new Customer();	// 부모 객체를 생성, 기본 생성자 호출 (등급 : Silver)
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());		// 고객 정보 출력 메소드 호출
		
		VIPCustomer customerKim = new VIPCustomer();	// 자식 객체를 생성
		customerKim.setCustomerID(10020);		// 부모 클래스의 메소드
		customerKim.setCustomerName("김유신");	// 부모 클래스의 메소드
		customerKim.bonusPoint = 1000;			// 부모 클래스의 메소드
		System.out.println(customerKim.showCustomerInfo());	// 부모 클래스의 메소드
	}

}
