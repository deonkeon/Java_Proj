package inheritance_07.lab13;

import java.util.ArrayList;

class Fruit { // 부모클래스
	protected String fruitName; // 변수의 초기값을 할당 : 1. 생성자, 2.Setter, 3. 객체에서 변수값을 할당
	protected String color;
	protected int large;

	public Fruit() {
	}

	public Fruit(String fruitName, String color, int large) {
		this.fruitName = fruitName;
		this.color = color;
		this.large = large;
	}

	public String showInfo() {
		return "과일의 내용을 출력합니다. 	";
	}
}

class Apple extends Fruit {
	public Apple(String fruitName, String color, int large) {
		super(fruitName, color, large);
	}

	@Override
	public String showInfo() {
		return "과일 이름은 " + fruitName + "이고, 색깔은 " + color + "이고, 크기는 " + large + "입니다. ";
	}

	public void app() {
		System.out.println("다운 캐스팅으로 사과를 출력 합니다. ");
	}
}

class Orange extends Fruit {
	public Orange(String fruitName, String color, int large) {
		super(fruitName, color, large);
	}

	@Override
	public String showInfo() {
		return "과일 이름은 " + fruitName + "이고, 색깔은 " + color + "이고, 크기는 " + large + "입니다. ";
	}

	public void org() {
		System.out.println("다운 캐스팅으로 오렌지를 출력 합니다. ");
	}
}

class Banana extends Fruit {
	public Banana(String fruitName, String color, int large) {
		super(fruitName, color, large);
	}

	@Override
	public String showInfo() {
		return "과일 이름은 " + fruitName + "이고, 색깔은 " + color + "이고, 크기는 " + large + "입니다. ";
	}

	public void bana() {
		System.out.println("다운 캐스팅으로 바나나를 출력 합니다. ");
	}
}

public class Fruit_Test {

	public static void main(String[] args) {
		ArrayList<Fruit> fruitList = new ArrayList<Fruit>();

		Fruit apple = new Apple("사과", "빨간색", 10); // 업캐스팅
		Fruit orange = new Orange("오렌지", "주황색", 15); // 업캐스팅
		Fruit banana = new Banana("바나나", "노란색", 20); // 업캐스팅

		fruitList.add(apple);
		fruitList.add(orange);
		fruitList.add(banana);

		for (Fruit fruit : fruitList) {
			System.out.println(fruit.showInfo());
		}
		System.out.println("==========다운캐스팅으로=============");

		((Apple) apple).app();
		((Orange) orange).org();
		((Banana) banana).bana();

		Apple a = (Apple) apple; // 다운캐스팅, 변수는 사용자가 지정해주기
		a.app(); // 리턴없이(void) 출력만 되므로 바로 호출해도됌.
		Orange o = (Orange) orange;
		o.org();
		Banana b = (Banana) banana;
		b.bana();

		System.out.println("============ArrayList 저장된 객체를 다운캐스팅=====================");
		for (int i = 0; i < fruitList.size(); i++) {
			Fruit f = fruitList.get(i);
			if (f instanceof Apple) {
				Apple ap = (Apple) f;
				ap.app();
			}
			if (f instanceof Orange) {
				Orange or = (Orange) f;
				or.org();
			}
			if (fruitList.get(i) instanceof Banana) {
				Banana ba = (Banana) f;
				ba.bana();
			}
		}

	}
}
