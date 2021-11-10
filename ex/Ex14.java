package ex;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		/*정수를 10 개 저장하는 배열을 만들고 1 에서 10 까지 범위의 정수를
		랜덤하게 생성하여 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라*/
		Scanner sc = new Scanner(System.in);
		int arr[];		// 배열 선언
		int num;		// 배열 방의 갯수
		int sum = 0;	// 배열 각방의 합을 구하는 변수
		
		System.out.println("정수 몇개를 사용 할까요?");
		num = sc.nextInt();
		
		arr = new int [num];	// 스캐너에서 인풋 받은 변수값을 배열 방크기로 설정
		
		System.out.printf("입력한 정수는 : ");
		for ( int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() *10+1);	//각 방에 랜덤한 정수값을 저장(1~10)
			System.out.printf("%d ", arr[i]);
			sum += arr[i];	// sum = sum + arr[i]
		}
		double avg = (double) sum/arr.length;
		System.out.println();
		System.out.println("입력한 정수의 합은 : " + sum);
		System.out.println("입력한 정수의 평균은 : " + ((double)sum/arr.length));
		System.out.println("입력한 정수의 평균은 : " + avg);
		System.out.printf("입력한 정수의 평균은 : %.1f" , avg);
	}
}
