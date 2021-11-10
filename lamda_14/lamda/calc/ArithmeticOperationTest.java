package lamda_14.lamda.calc;

import java.util.Scanner;

public class ArithmeticOperationTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 정수를 입력하세요 > ");
		int first = sc.nextInt();
		System.out.println("첫번째 정수를 입력하세요 > ");
		int second = sc.nextInt();

		try {
			System.out.println("1. 객체 지향으로 출력 하기");
			ArithmeticOperationComp comp01 = new ArithmeticOperationComp();
			comp01.ArithmeticOper(first, second);
		} catch (ArithmeticException e) {
			System.out.println(e + " / 0으로는 나눌 수 없습니다. ");
		}
		System.out.println("프로그램 종료");

		try {
			System.out.println("2. 람다식으로 출력 하기");

			ArithmeticOperation comp02 = (x, y) -> System.out.println("a + b = " + (x + y));
			ArithmeticOperation comp03 = (x, y) -> System.out.println("a - b = " + (x - y));
			ArithmeticOperation comp04 = (x, y) -> System.out.println("a * b = " + (x * y));
			ArithmeticOperation comp05 = (x, y) -> System.out.println("a / b = " + (x / y));

			comp02.ArithmeticOper(first, second);
			comp03.ArithmeticOper(first, second);
			comp04.ArithmeticOper(first, second);
			comp05.ArithmeticOper(first, second);
		} catch (ArithmeticException e) {
			System.out.println(e + " / 0으로는 나눌 수 없습니다. ");
		}
		System.out.println("프로그램 종료");

		System.out.println("3. 익명 내부 객체로 출력 하기");

		try {
			ArithmeticOperation comp06 = new ArithmeticOperation() {

				@Override
				public void ArithmeticOper(int a, int b) {
					System.out.println("a + b = " + (a + b));
					System.out.println("a - b = " + (a - b));
					System.out.println("a * b = " + (a * b));
					System.out.println("a / b = " + (a / b));
				}
			};
			comp06.ArithmeticOper(first, second);
		} catch (ArithmeticException e) {
			System.out.println(e + " / 0으로는 나눌 수 없습니다. ");
		}
		System.out.println("프로그램 종료");

	}

}
