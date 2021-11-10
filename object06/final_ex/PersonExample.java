package object06.final_ex;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person ("123456-1234567", "계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		System.out.println();
		
		//p1.nation = "USA";			// final이 할당된 변수[상수]에는 값을 수정 할 수 없다.
		//p1. ssn = "654321-1234567"	// final이 할당된 변수[상수]에는 값을 수정 할 수 없다.
		p1.name = "을지문덕";		// 변수, 값을 할당 할 수 있다.
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
	}

}
