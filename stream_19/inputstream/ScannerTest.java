package stream_19.inputstream;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("이름 : ");
		String name = sc.nextLine();	// String 데이타를 인풋 받음
		System.out.println("직업 : ");
		String job = sc.nextLine();
		System.out.println("나이 : ");
		int age = sc.nextInt();
		System.out.println("사각형의 세로 길이");
		double width = sc.nextDouble();
		
		System.out.println("======출력 결과======");
		System.out.println(name);
		System.out.println(job);
		System.out.println(age);
		System.out.println(width);
		
	}
	
}
