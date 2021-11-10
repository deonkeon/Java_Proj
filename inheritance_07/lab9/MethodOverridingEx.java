package inheritance_07.lab9;
public class MethodOverridingEx {
	static void paint (Shape p) {		// Stack 영역에 저장되는 메소드, 매개변수(Shape p), 클래스 함수(정적함수/전역함수)
		p.draw();		//업캐스팅 : 
	}
	static void paint_1 (Line l) {	// Line 클래스
		l.draw();
	}
	static void paint_r (Rect r) {	// Rect
		r.draw();
	}
	static void paint_c (Circle c) {	//Circle
		c.draw();
	}
	
	
	public static void main(String[] args) {
		Line line = new Line(); // Line이라는 객체를 생성시, 각 도형들은 Shape를 상속받고 있다.
								// 따라서 Shape와 Line 객체의 특성을 가진(포함된) Line 객체가 생성된다.
								// 호출시 오버라이딩이 되어서 Shape의 메소드를 호출하게 된다.
		paint(line);			// line 객체를 생성 후 Paint 메소드에 line 객체 할당
		paint (new Shape());	// paint 메소드 내에서 객체를 생성해서 매개변수로 호출
		paint (new Line());
		paint (new Rect());		
		paint (new Circle());	// ==> 각 paint(); 메소드는 매개변수를 받은 후 위에 있는
								// static void paint (shape p)를 호출, p.draw();는 shape에있는 메소드를 호출한다.
		
	}

}
