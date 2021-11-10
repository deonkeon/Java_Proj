package inheritance_07.practice;

import java.util.ArrayList;

public class FruitTest {

	public static void main(String[] args) {
		ArrayList<Fruit> fruitList = new ArrayList<Fruit>();
		
		Fruit fruitApple = new Apple ("사과", "빨간색", 10);
		Fruit fruitBanana = new Banana ("바나나", "노란색", 20);
		Fruit fruitOrange = new Orange ("오렌지", "주황색", 15);
		
		fruitList.add(fruitApple);
		fruitList.add(fruitBanana);
		fruitList.add(fruitOrange);
		
		System.out.println("=========과일 목록 출력 ==========");
		
		for (Fruit fruit : fruitList) {
			System.out.println(fruit.showfruitInfo());
		}
	}

}
