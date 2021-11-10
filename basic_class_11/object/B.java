package basic_class_11.object;

public class B //[extends Object]	<== []가 생략되어 있다. 컴파일러가 자동으로 삽입(컴파일 할 때)
	{		// Java의 모든 클래스는 Object 클래스를 상속 받는다.
			// import java.lang.Object
			// java.lang.* 		<== 자동으로 임포트됨, 컴파일 할 때 컴파일러가 자동으로 import 한다.
			// 모든 클래스는 Object 클래스의 메소드를 사용할 수 있다.
			// Object 클래스의 메소드를 재정의 할 수 있다. (Final 키가 있는 메소드는 재정의 불가)
			// 모든 클래스는 Object 클래스로 업캐스팅 가능
	
	
	B(){		// 기본 생생자, 다른 생성자가 없을 때 생략 가능
		
	}
	int a = 1;
	void b () {
		System.out.println(a);
	}
	public static void main(String[] args) {

	 B b = new B();
	 
	 Object c = b;		// Object 타입으로 업캐스팅
	 B d = (B) c;		// 다운캐스팅 ==> Object 타입 c를 다시 B 클래스로 다운캐스팅
	 

	 b.a = 10;			// B class의 a 값을 1에서 10으로 변경
	 b.b();				// B class ==> b.a를 10으로 재정의 했기때문에 b(a를 출력)이 10으로 변경됨
	 b.toString();		// Object 클래스의 메소드
	 
	}
}
