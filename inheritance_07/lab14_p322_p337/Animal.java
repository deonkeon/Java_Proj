package inheritance_07.lab14_p322_p337;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다. ");
	}
	
	public abstract void sound();
}
