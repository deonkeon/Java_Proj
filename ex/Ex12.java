package ex;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		/*양의 정수를 10 개 입력받아 배열에 저장하고, 배열에 저장하고, 배열에
		 * 있는 정수 중에서 3 의 배수만 출력하는 프로그램을 작성하라.*/
		int arr[] = new int[10];	//arr 배열변수에 정수값 10개를 받는 배열 변수 선언
		Scanner sc = new Scanner(System.in);	//스캐너 객체 생성
		
		System.out.println("양의 정수를 입력하세요 : ");	//문자열 출력.
		for (int i = 0; i<arr.length; i++) {	// 인풋받은 정수 10개를 배열의 각 방에 저장
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.printf("3의 배수는 : ");	//for문 + if문 사용해서 각 방에 조건 걸어줌
		for (int i = 0; i<arr.length; i++) {
			if(arr[i]%3==0) {	// arr의 각방의 값에 3을 나눠 나머지가 0이라면 출력
				System.out.printf("%d ", arr[i]);
			}
		}
	}
}
