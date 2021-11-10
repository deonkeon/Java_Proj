package inheritance_07.practice;

public class Orange extends Fruit {
	public Orange (String fruitName, String fruitColor, int size) {
		super(fruitName, fruitColor, size);
	}
	public String showfruitInfo() {
		return fruitName + "는 " + fruitColor + "이며 크기는 " + size + "입니다";
	}
}
