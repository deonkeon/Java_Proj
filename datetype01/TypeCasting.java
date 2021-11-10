package datetype01;

public class TypeCasting {
	public static void main(String[] args) {
		/*
		 * 1] 묵시적 형변환:
		 * 작은 그릇의 데이터를 -> 큰 그릇에 넣을 때
		 * =>형변환이 자동으로 일어 남
		 * 
		 * 2] 명시적 형변환
		 * 큰 그릇의 데이터를 -> 작은그릇에 넣을 때
		 * =>자료의 손실이 일어 날 수도 있다.
		 */
		byte b1=65;
		short s1;
		s1=b1;//[o] 묵시적 형변환
		System.out.println("b1:"+b1+",s1:"+s1);
		int num1 = s1+b1; //[0] 묵시적 형변환
		
		char ch1 = (char)b1; // 명시적 형변환
		System.out.println(ch1);
		
		short s2 = 100;
		byte b2 = (byte)s2;
		System.out.println(b2);//데이타 미손실
		int num2 = 300;
		b2= (byte)num2;
		System.out.println(b2);//데이타 손실
		
		double d1 = 3.14;
		int num3 = (int)(num2+d1); //데이타 손실
		
		//참조형 (대문자시작)
		//String str="컴퓨터";
		
		System.out.println("d1:"+d1+"+num2:"+num2+"=num3:"+num3);
	}
}
