package ex;

public class Ex15 {

	public static void main(String[] args) {

		/*
		 * 반복문을 이용하여 369 게임에서 박수를 쳐야 하는 경우를 순서대로 화 면에 출력해보자. 1 부터 시작하며 99 까지만 한다. 실행 사례는
		 * 다음과 같다.
		 */

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == 3 || i == 6 || i == 9) {
					if (j == 3 || j == 6 || j == 9) {
						System.out.printf("%d%d 박수 짝짝\n", i, j);
					} else {
						System.out.printf("%d%d 박수 짝\n", i, j);
					}
				} else {
					if (j == 3 || j == 6 || j == 9) {
						System.out.printf("%d%d 박수 짝\n", i, j);
					}
				}
			}
		}

	}

}
