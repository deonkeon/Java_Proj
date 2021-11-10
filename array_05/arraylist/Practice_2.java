package array_05.arraylist;

import java.util.Scanner;

public class Practice_2 {

	public static void main(String[] args) {
		/* 배열 방의 수를 입력(스캐너) 받아 배열의 크기를 생성하고,
		 * 각 방에 정수를 넣어(스캐너)서 입력하고
		 * 각방의 내용을 향상된(enhanced For)으로 출력하고, 평균을 출력하라.
		 */
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int max = 0;
		
		System.out.print("배열의 크기를 지정해주세요. ");
		int a = sc.nextInt();
		int[] array = new int[a];
		
		System.out.printf("%d개 만큼 정수를 입력해주세요 : ", a);
			
		for(int i : array) {
			array[i] = sc.nextInt();
			sum += array[i];
			if (array[i]>max) {
				max = array[i];
			}
		}

		double avg = (double)sum/array.length;
		System.out.println("입력한 정수의 합은 : " + sum);
		System.out.println("입력한 정수의 평균은 : " + avg);
		System.out.println("입력한 정수 중 가장 큰 수는 : " + a);
		sc.close();
		
	}

}
