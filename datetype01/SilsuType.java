package datetype01;

import java.math.BigDecimal;

public class SilsuType {

	public static void main(String[] args) {
		//부동소수점방식 : 가수부, 지수부 (ex)부동수소점 - 3.14), (1.6 가수부 x 10^-3 지수부) - 따로따로 표현됌
		//규칙1]정수형보다는 실수형이 더 큰 그릇이다.				====> 지수부는 0을 표현 할 수 없다.
		//long(정수형):8byte, float(실수형):4byte
		long ln = 100;
		float fl = 200;
		
		//long = ln+fl;[x] long형과 float형 연산결과는 float
		float f1 = ln + fl;
		System.out.println(f1);
		
		/*규칙2]실수형에서 기본 데이타 타입은 double이다
		 소수점이 붙으면 무조건 double형으로 인식
		 단, 소수점이 붙지 않은 값은 float에 담을 수 있다 */
		
		//방법1]형변환(강제캐스팅)
		float f2 = (float)3.14;
		System.out.println("f2:"+f2); 
		
		//방법2]실수뒤에 F를 붙인다.(float으로 인식함, 소문자도가능)
		f2 = 3.14F;
		System.out.println("f2:"+f2); 
		
		/* 
		 * 규칙3] 실수형도 같은 자료형끼리의 연산결과는
		 * 			같은 자료형, 큰자료형과 작은 자료형과의
		 * 			연산결과는 큰 자료형.
		 */
		float f3 = 300, f4 = 400, f5;
		f5 = f3 + f4;
		System.out.println(f5);
		
		double d1=10.0, d2;
		//f6=f3 + d1;[x] //float형과 double형의 연산결과는 double형이기 때문에
		d2 = f3 + d1;
		System.out.println("d2:"+d2);
		
		/* 문]
		 * 반지름이 10인 원의 면적을 구하여라
		 * 단 면적을 저장하는 변수의 타입을 3가지 형태(int/float/double)의
		 * 자료형에 저장하고 출력하여라 그리고 소수점을 제거하여라
		 * 원의 면적 : 반지름*반지름*3.14
		 * 단, 아래의 변수 radius와 pi를 사용해서 구해라
		 */
		
		int radius=10;
		double pi = 3.14;
		int iarea;
		float farea;
		double darea;
		
		iarea = (int)(radius*radius*pi);
		farea = (float)(radius*radius*pi);
		darea = (double)(radius*radius*pi);
		
		System.out.println("iarea:" + iarea);
		System.out.println("farea:" + (int)(farea));
		System.out.println("farea:" + (int)(darea));
		
		// 부동소수 방식 연산오류(지수로 표현되는 값이 0을 나타 낼 수 없다.)
		double dl1=0.1;
		double dl2=0.2;
		
		System.out.println(dl1+dl2);
		System.out.println(dl1*dl2);
		System.out.println(dl1+dl2==0.3);
		// 부동소수는 가수부와 지수부로 표현되는데, 지수부분에 약간의 오류가 있음.
		
		BigDecimal big1 = new BigDecimal("0.1");
		BigDecimal big2 = new BigDecimal("0.2");
		BigDecimal big3 = big1.add(big2);
		System.out.println("big3:" +big3);
		/*
		 * BigDecimal타입1.compareTo(BigDecimal타입2)
		 * 값이 같으면 0
		 * BigDecimal타입1 가리키는 값이 더 크면 1
		 * BigDecimal타입1 가리키는 값이 더 작으면 -1
		 */
		System.out.println(big3.compareTo(new BigDecimal("0.3")));
		
		
	}

}
