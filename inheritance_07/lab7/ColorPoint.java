package inheritance_07.lab7;

public class ColorPoint extends Point {

	private String color ;		//필드
	public ColorPoint(int x, int y, String color) {		//생성자
		super (x,y);			//슈퍼 클래스의 생성자를 호출 (매개변수 2개)
		this.color = color;
	}
	
	public void showColorPoint() {	// 
		System.out.println(color);
		showPoint();	// 상속된 메소드 호출 : Point class의 메소드
	}
	
	
}
