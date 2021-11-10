package inheritance_07.lab14_p322_p337;

public class Dog extends Animal{
	public Dog() {
	this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}	
