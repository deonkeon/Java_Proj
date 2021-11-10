package object06.hide.p;

public class B {
	public int n;		//public 접근 지정자는 : 같은 패키지 및 다른 외부 패키지에서도 접근 가능
	public void n() {
		n =5;
	}
	protected int k;	//protected 같은 패키지에서는 접근이 가능, 다른 패키지 일 때 상속관계에 있으면 접근 가능 
	protected void K() {
		k = 5;
	}
	
	int m;				//default 접근 지정자 : 생략됨, 같은 패키지 내에서는 접근 가능, 다른 패키지에서는 접근 불가능
	void m() {
		m=10;
	}
	
	private int p;		//private 접근 지정자는 외부에서 접근 불가, 같은 클래스내에서만 접근 가능
	private void p() {
		p = 20;
	}
}
