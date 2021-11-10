package inheritance_07.lab10_upcasting;
public class UpcastingEx {
	public static void main(String[] args) {
		Person p;
		Student s = new Student("홍길동");	//s는 Person, Student의 필드와 메소드에 접근가능
		
		
		
		p = s;		// Upcasting	Person p = new Student()
					// p는 Person class만 접근 가능 (업캐스트되었음)
					// 단, 메소드 오버라이딩이 된 메소드에 접근 했을 때 동적바인딩에 의해서 자식의 메소드를 호출
		
		System.out.println(p.name);
		
		p.fly();	//동적 바인딩 적용해서 자식 클래스의 fly()가 출력.
		
		//p.grade = "A";			// 오류
		//P.department = "Com";	// 오류
		
		
		
	}

}
