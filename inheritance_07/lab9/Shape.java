package inheritance_07.lab9;

class Shape {		// 슈퍼 클래스, 메소드 재정의(Overrriding)를 사용해서 다형성을 구현
	public Shape next;		// 객체 선언, Shape : 객체형 데이터 타입, next : 인스턴스 변수
	public Shape() {next = null;}		// 생성자
	
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	public void draw() {		// 오버라이딩
		System.out.println("Line");
	}
}
class Rect extends Shape {		// 오버라이딩
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	public void draw() {		// 오버라이딩
		System.out.println("Circle");
	}
}
