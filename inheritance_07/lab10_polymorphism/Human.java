package inheritance_07.lab10_polymorphism;

public class Human extends Animal {

	@Override
	public void move () {	// 오버라이딩
		System.out.println("사람이 두발로 걷습니다. ");
	}
	public void readBook () {
		System.out.println("사람이 책을 읽습니다. ");
	}
}
