package inheritance_07.lab10_downcasting;

public class Student extends Person {
	String grade;
	String department;
	
	public Student (String name) {
		super(name);
	}
	
	@Override
	public void fly() {
		System.out.println(" 비행기를 타고 납니다. - Student ");
		
	}
}
