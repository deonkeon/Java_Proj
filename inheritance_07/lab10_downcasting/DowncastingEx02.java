package inheritance_07.lab10_downcasting;

public class DowncastingEx02 {

	public static void main(String[] args) {
		Student s;		// 객체 변수 (인스턴스 변수) 선언 : s
		Person p;		// 객체 변수 (인스턴스 변수) 선언 : p
		
		s = new Student ("홍길동");	// 객체 생성
		System.out.println("========업캐스팅==========");
		p = s;
		//p = (Person) s;		// 업캐스팅 : 강제 데이타타입을 생략할 수 있다.
		p.id = "2000"; p.name = "김자바" ;
			p.fly();	//오버라이딩 된 메소드 호출
		
		System.out.println("========다운캐스팅==========");
		s = (Student)p;		// 다운캐스팅 : 데이타 타입을 명시해야한다 (강제)
		s.id = "3000"; s.name = "공자바"; s.grade ="4"; s.department = "sales";
			s.fly();	//오버라이딩 된 메소드 호출
	}

}
