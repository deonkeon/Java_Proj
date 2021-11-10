package inheritance_07.lab10_polymorphism;
public class AnimalTest1 {
	
	public void moveAnimal(Animal animal) {	// 업캐스팅, //moveAnimal 메소드를 사용할려면 객체화
		animal.move();
	}

	public static void main(String... args) {
		AnimalTest1 aTest = new AnimalTest1();
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
		
		
	}
}
