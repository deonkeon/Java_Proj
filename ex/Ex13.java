package ex;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		/*배열과 반복문을 이용하여 프로그램을 작성해보자. 키보드에서 정수로
		된 돈의 액수를 입력받아 오만 원권, 만 원권, 천 원권, 500 원짜리 동전, 100 원
		짜리 동전, 50 원짜리 동전, 10 원짜리 동전, 1 원짜리 동전이 각 몇 개로 변환되
		는지 예시와 같이 출력하라. 이때 반드시 다음 배열을 이용하고 반복문으로 작성
		하라.*/
		int unit[] = {50000, 10000, 1000, 500, 100, 50, 10, 1};	//환산할 돈의 종류, 배열에 저장 
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요 >> ");
		int input = sc.nextInt();	//인풋 받는 돈의 액수 선언 및 초기화
		for (int i=0; i<unit.length; i++) {
			System.out.println(unit[i] + "원 : " + input/unit[i] + "개 ");
			input%=unit[i];
		}
		sc.close();
	}
}