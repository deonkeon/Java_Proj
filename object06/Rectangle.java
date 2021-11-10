package object06;

import java.util.Scanner;

public class Rectangle {		//넓이와 높이를 입력 받아서 넓이(면적)를 구하는 프로그램.
	int width;  
	int height;   // ==> 필드
	
	public Rectangle() {}		/* 기본 생성자(class 이름을 받으면서 실행부가 없는 생성자)는 생략이 가능
								(단 다른 생성자가 없는 경우, 외부에서 호출하지 않는 경우)*/
	public int getArea() {		//int 값을 리턴 돌려주는 getArea 메소드
		return width * height;
	}  /// 메소드
			//RAM(heep)영역에 변수값 할당
	public static void main(String[] args) { //메인 메소드
		Rectangle rect = new Rectangle();		
		Scanner scanner = new Scanner(System.in); //Scanner(system.in); input 받아서 처리
		System.out.println( ">> ");
		
		rect.width = scanner.nextInt(); //int값 받아서 width에 할당
		rect.height = scanner.nextInt();
		
		System.out.println("사각형의 면적은" + rect.getArea());
		
		
	}

}
