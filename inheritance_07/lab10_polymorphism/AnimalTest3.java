package inheritance_07.lab10_polymorphism;

public class AnimalTest3 {
	public static void moveAnimal(Animal animal) { // 업캐스팅, //moveAnimal 메소드를 사용할려면 객체화
		animal.move();
	}

	public static void main(String... args) {
		Human human = new Human();
		Tiger tiger = new Tiger();
		Eagle eagle = new Eagle();
		
		AnimalTest3.moveAnimal(human); // static 키 : Stack, 클래스 이름으로 사용
		AnimalTest3.moveAnimal(tiger);
		AnimalTest3.moveAnimal(eagle);

	}
}
