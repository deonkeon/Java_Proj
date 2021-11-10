package basic_class_11.class_ex;

public class Person {
	private String name;	// 생성자, setter를 통해서 할당 : private
	private int age;
	
	public Person() {}					// 기본 생성자
	public Person(String name) {		// 매개 변수가 1개인 생성자
		this.name = name;
	}
	
	public Person(String name, int age) {	// 매개 변수가 2개인 생성자
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
