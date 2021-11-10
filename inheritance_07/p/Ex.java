package inheritance_07.p;

public class Ex {

		public static void main(String[] args) {
			A a = new A();
			
			B b = new B();
			b.set();			// 상속된 클래스 변수의 값 할당
			b.showInfo();		// 상속된 클래스 변수의 값 출력
	}

}
