package inheritance_07.lab4.arraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer (10010, "이순신");
		Customer customerShin = new Customer (10020, "신사임당");
		Customer customerHong = new GoldCustomer (10030, "홍길동");		//업캐스팅
		Customer customerYul = new GoldCustomer (10040, "이율곡");		//업캐스팅
		Customer customerKim = new VIPCustomer (10050, "김유신", 12345);	//업캐스팅
		
		customerList.add(customerLee);	// index 0
		customerList.add(customerShin);	// index 1
		customerList.add(customerHong);	// index 2
		customerList.add(customerYul); 	// index 3
		customerList.add(customerKim); 	// index 4
		
		System.out.println("===========고객정보 출력============");
		
		for (Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		System.out.println("===========보너스 포인트와 할인율 계산================");
		int price = 10000;
		
		for (Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불 하셨습니다.");
			System.out.println(customer.getCustomerName() + "님의 현재 포인트는 " + customer.bonusPoint + "입니다. ");
	
		}
		
		
		System.out.println("==============");
		Customer customer = customerList.get(4);
		System.out.println(customer.showCustomerInfo());
		
	}

}
