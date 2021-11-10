package inheritance_07.lab4.arraylist;

public class GoldCustomer extends Customer {
	double saleRatio;		// 물품 가격 할인률
	
	public GoldCustomer(int customerID, String customerName) {
		super (customerID, customerName);
		
		customerGrade = "GOLD";
		bonusRatio = 0.02;		// 포인트 적립 비율 : 2%
		saleRatio = 0.05;		// 가격 할인 비율 : 5%
	}
	@Override
	public int calcPrice (int price) {
		bonusPoint += price * bonusRatio;		// 기존의 보너스 포인트에서 가격*보너스비율
		return price - (int)(price*saleRatio);
	}
}
