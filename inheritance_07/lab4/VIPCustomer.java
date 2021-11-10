package inheritance_07.lab4;

public class VIPCustomer extends Customer {
	private int agentID;		//VIP 고객은 담당 사원이 특별 관리
	double saleRatio;			//물품의 할인률, VIP고객에게만 적용	
	
	public VIPCustomer () {
		//super();		// 슈퍼[부모]클래스의 생성자를 호출, 컴파일러가 super(); 자동으로 넣는다.
						// super() 를 선언 할때는 반드시 첫 라인에 와야한다.
		customerGrade = "VIP";	//상속된 필드, 고객등급 : VIP
		bonusRatio = 0.05;		//상속된 필드, 보너스 적립 비율 : 5%
		saleRatio = 0.1;		//물품의 할인율 ( 10% 할인 )
	}
	public VIPCustomer (int customerID, String customerName, int agnetID) {
		//super ( , ,); 상위클래스의 매개변수 3개가 있는 생성자를 호출함. 생성자 아래 첫라인에 와야함.
		super(customerID, customerName);
		customerGrade = "VIP";		// super : 부모클래스의 생성자 호출
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	public int calcPrice (int price) {	// 메소드 오버라이딩 : 상속 관계에서 super[부모]클래스의 메소드를 재정의하여 사용
		bonusPoint += price * bonusPoint;			// 보너스 포인트 적립
		return price - (int)(price * saleRatio);	// VIP 고객인 경우 : 물품 가격 할인 (10%)
	}
	public int getAgent () {return agentID;}
	
}
