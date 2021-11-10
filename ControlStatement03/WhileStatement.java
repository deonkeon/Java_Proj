package ControlStatement03;

import java.io.IOException;

public class WhileStatement {
	public static void main(String[] args) throws IOException {
		/*
		 * while문]
		 * 반복의 수가 정해져 있지 않을때 주로 사용
		 * 
		 * 형식]
		 * [초기식;]
		 * while(반복조건식) {
		 * 	수행문;
		 * 	[증감식;]
		 * 	...
		 * }
		 * 
		 * -조건식은 비교식 내지 논리식이어야한다.
		 * -조건식이 참일 동안 반복수행
		 * -초기식은 반드시 초기화해야된다.
		 * 
		 * 무한반복
		 * while(true){
		 * 	수행문;
		 * }
		 * 
		 */
		//1에서 10까지 누적합
		int i=1;
		int sum=0;
		while(i<=10) {
			sum+=i;
			i++;
		}
		System.out.println("1에서 10까지 누적합:"+sum);
		System.out.println("while문이 끝난 후 i:"+i);
		
		/*
		 * 문] 1부터 1000까지 숫자중 3의 배수이거나 5의 배수인
		 * 숫자의 합을 구하여라
		 * 단, 3과5의 공배수인 경우 제외(while문 사용)
		 */
		i=1;
		sum=0;
		while(i<=1000) {
			if(i%3==0^i%5==0) sum+=i; //if((i%3==0||i%5==0)&& i%15!=0);
			i++;
		}
		System.out.println(sum);

		System.out.println("문자열을 입력하세요.");
		char word;
		//사용자가 몇 자를 입력할지 모름으로 while문으로 사용(for문도 사용가능)
		while((word=(char)System.in.read()) !=13) {
			System.out.println(word); //13=enter /n/r
		}//while
		System.out.printf("%n");
		
		/*
		 * 1 0 0 0 (1,1)
		 * 0 1 0 0 (2,2)
		 * 0 0 1 0 (3,3)
		 * 0 0 0 1 (4,4) 처럼 출력해 보자(단 while문 사용)
		 */
		
		System.out.println("[행, 열 출력]");
		int r=1;
		while(r<=4) {//r=행번호 1,2,3,4
			int c=1;
			while(c<=4) {
				if(r==c) System.out.printf("%-2d", 1);
				else System.out.printf("%-2d", 0);
				c++;
			}
			System.out.println();
			r++;
		}

		/*
		 * *
		 * * *
		 * * * *
		 * * * * *를 출력하여라(단,while문 사용)
		 */
		
		System.out.println("[행, 열 출력]");
		int a=1;
		while(a<=5) {
			int b=1;
			while(b<=5) {
				if(a>=b) System.out.printf("%-2c",'*'); //a가 b보다 클때(같거나)만 *찍음.
				b++;
			}
			System.out.println();
			a++;
		}
		
		/* * * * *
		   * * * *
		 	 * * *
		 	   * *
		 		 *를 출력하여라(단,while문 사용)
		 */
		System.out.println("[행, 열 출력]");
		int b=1;
		while(b<=5) {
			int c=1;
			while(c<=5) {
				if(c>=b) System.out.printf("%2c",'*');
				else System.out.printf("%2c", ' ');
				c++;
			}
			//줄바꿈
			System.out.println(); 
			b++;
		}
		
		/*
		 * 문]아래 형식대로 구구단을 출력
		 * 2 * 1 = 2	3 * 1 = 3	4 * 1 = 4 .......9 * 1 = 9
		 * 2 * 2 = 4	3 * 2 = 6	3 * 3 = 9........9 * 2 = 18
		 * ..
		 * 
		 * ..
		 * 2 * 9 = 18	3 * 9 = 27	4 * 9 = 36.......9 * 9 = 81
		 * 
		 */
		
		System.out.println("[구구단 출력]");
		int k=1;
		while(k<=9) {//행
			int l=2;
			while(l<=9) {//열
				System.out.printf("%d * %d = %-2d ", l, k, k*l);
				l++;
			}
			System.out.println();//줄바꿈
			k++;
		}
		
		
	}///main

}///class
