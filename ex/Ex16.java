package ex;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		/*
		 * 다음 코드와 같이 과목과 점수가 짝을 이루도록 2 개의 배열을 작성하 라. String course[] = {"Java", "C++",
		 * "HTML5", "컴퓨터구조", "안드로이드"}; int score[] = {95, 88, 76, 62, 55}; 그리고 다음 예시와 같이
		 * 과목 이름을 입력받아 점수를 출력하는 프로그램을 작 성하라. "그만"을 입력받으면 종료한다. (Java 는 인덱스 0 에 있으므로
		 * score[0] 을 출력)
		 */

		String course[] = { "Java", "C++", "HTML5", "컴퓨터구조", " 안드로이드" };
		int score[] = { 95, 88, 76, 62, 55 };
		Scanner sc = new Scanner(System.in);
		String name = ""; // 스캐너에서 입력을 받도록 하는 변수 / String name = " ";
		int i = 0;

		while (true) {
			System.out.println("과목 이름을 입력 하세요. >> ");
			name = sc.next(); // 문자열을 인풋 받을 때 next() 메소드 사용.
			if (name.equals("그만"))
				break; // break;를 만나면 while문을 빠져 나온다.
			for (i = 0; i < course.length; i++) {
				if (course[i].equals(name)) {
					System.out.println(course[i] + "의 점수는 " + score[i] + "입니다.");
					break;
				}

			}
			if (i == course.length) {
				System.out.println("없는 과목입니다.");
			}
		}
		System.out.println("while 문을 종료합니다.");
		sc.close();
	}

}
