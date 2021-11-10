package inheritance_07.practice;

public class Banana extends Fruit{
	public Banana (String fruitName, String fruitColor, int size) {
		super(fruitName, fruitColor, size);
	}
	public String showfruitInfo() {
		return fruitName + "는 " + fruitColor + "이며 크기는 " + size + "입니다";
	}
}
