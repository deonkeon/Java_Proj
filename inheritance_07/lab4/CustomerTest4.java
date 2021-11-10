package inheritance_07.lab4;

public class CustomerTest4 {	// 업 캐스팅 : 부모클래스의 필드와 메소드만 접근,
								// 단, 오버라이딩된 메소드를 호출할 경우, 동적바인딩에 의해서 자식 메소드가 호출
	public static void main(String[] args) {
		Customer vc = new VIPCustomer (10030, "홍길동", 2000);	//업캐스팅
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getCustomerName() + "님이 지불해야할 금액은 " + 
				vc.calcPrice(10000));
	}

}
