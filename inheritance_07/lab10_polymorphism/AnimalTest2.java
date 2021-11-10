package inheritance_07.lab10_polymorphism;

public class AnimalTest2 {	// Stack 영역에 메소드 저장(static)

	public static void moveAnimal(Animal animal) {	// 업캐스팅, //moveAnimal 메소드를 사용할려면 객체화
		animal.move();
	}

	public static void main(String... args) {

		AnimalTest2.moveAnimal(new Human());	//static 키 : Stack, 클래스 이름으로 사용
		AnimalTest2.moveAnimal(new Tiger());
		AnimalTest2.moveAnimal(new Eagle());
		
		
	}
}
