package inheritance_07.lab10_downcasting;

public class Person {	// 슈퍼 클래스
	String name;	// 변수이름은 소문자, 객체와 클래스는 대문자 
	String id;
	
	public Person (String name) {
		this.name = name;
	}
	
	public void fly () {
		System.out.println("하늘을 납니다. - Person");
	}
}
