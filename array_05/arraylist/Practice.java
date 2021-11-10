package array_05.arraylist;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		/* 배열 방의 수를 입력(스캐너) 받아 배열의 크기를 생성하고,
		 * 각 방에 정수를 넣어(스캐너)서 입력하고
		 * 각방의 내용을 향상된(enhanced For)으로 출력하고, 평균을 출력하라.
		 */
		
	      Scanner sc = new Scanner(System.in);
	      int max=0;
	      int sum=0;
	      
	      System.out.print("배열의 방을 몇개할까요 : ");
	      int aa = sc.nextInt();
	      int intArray[] = new int[aa];
	      
	      System.out.printf("%d개의 정수를 입력하세요 : ",aa);
	      for(int i : intArray) {
	         intArray[i] = sc.nextInt();
	         sum += intArray[i];
	         if(intArray[i] > max) {
	            max = intArray[i];
	         }
	      }
	      System.out.println("입력한 배열의 갯수 : "+aa);
	      System.out.println("입력한 값의 총합 : " +sum);
	      System.out.println("입력한 값 중 제일 큰값 : "+max);
	      System.out.println("값의 평균 : "+(double)(sum/intArray.length));
	      
	      sc.close();
	}
}