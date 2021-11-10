package inheritance_07.lab4;

public class CustomerTest2 {//매개변수가 3개인 생성자 호출

	public static void main(String[] args) {
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);
		customerKim.bonusPoint = 10000;
		
		System.out.println(customerKim.showCustomerInfo());
	}

}
