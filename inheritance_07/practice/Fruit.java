package inheritance_07.practice;

public class Fruit {
	protected String fruitName;
	protected String fruitColor;
	protected int size;

	public Fruit (String fruitName, String fruitColor, int size) {
		this.fruitName = fruitName;
		this.fruitColor = fruitColor;
		this.size = size;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public String getFruitColor() {
		return fruitColor;
	}

	public void setFruitColor(String fruitColor) {
		this.fruitColor = fruitColor;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public String showfruitInfo() {
		return "과일의 내용을 출력합니다. ";
	}
	
}
