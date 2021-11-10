package lamda_14.inner_class;

class A {
	int a = 10;				// 인스턴스 변수
	static int b = 20;		// 정적 변수수
	
	void a() {				// 인스턴스 메소드
		System.out.println(a);	
	}
	static void b() {		// 정적 메소드
		System.out.println(b);
	}
}

class B {
	int a = 100;
	static int b = 200;
	
	Runnable c = new Runnable() {		// 익명 클래스

		@Override
		public void run() {
			
		}
		
	};
}


public class AnonymousClassTest01 {

	public static void main(String[] args) {
		System.out.println("=======인스턴스 변수 출력 하기=======");	// 객체를 생성해서 출력
		A a = new A();	// 객체화
		a.a();			// 인스턴스 메소드 호출
		a.b();			// 정적 메소드 호출
		
		System.out.println("=======인스턴스 생성없이 객체이름으로 출력=======");
		A.b();		// 정적 메소드, 정적 필드만 호출
		
	}

}
