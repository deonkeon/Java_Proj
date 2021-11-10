package object06;

public class Circle2 { // 생성자가 2개인 Circle class, 생성자[메소드] 오버로딩 (같은이름으로 매개변수에 따라서 호출)
						// 생성자는 객체를 초기화하는 역할을 한다. (맴버 변수에 기본값을 할당)
	int radius; // 맴버 변수 : 객체에 설정된 변수 (힙영역에 생성됨)
	String name; // class 아래에 형성된 맴버변수는 new(생성자)를 사용하여 객체를 생성해야만 호출하여 사용가능

	public Circle2() {
		radius = 1;
		name = "";
	}

	public Circle2(int r, String n) { // ()안이 매개변수
		radius = r;
		name = n;
	}

	public double getArea() {
		return 3.14 * radius * radius;
	}

	public static void main(String[] args) {
		Circle2 pizza = new Circle2(10, "자바 피자");
		double area = pizza.getArea();
		System.out.println(pizza.name + " 의 면적은 " + area);

		Circle2 donut = new Circle2();
		donut.name = "도넛 피자";
		area = donut.getArea();
		System.out.println(donut.name + " 의 면적은 " + area);

	}

}
