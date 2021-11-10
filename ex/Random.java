package ex;

public class Random {

	public static void main(String[] args) {

		
		int n = (int)(Math.random()*3);		//0,1,2 값만 출력
		System.out.println(n);
		
		System.out.println("=========================");
		System.out.println(Math.random()); // 0.0xxxxxxxxxxxx...~ 0.9xxxxxxxxx....
		System.out.println(Math.random() * 10); //0.xxxxxxxx.....~ 9.xxxxxxxx.....
		System.out.println((int)Math.random() * 10); // 0~9
		System.out.println((int)Math.random() * 10+1); // 1~10까지의 랜덤한 값을 출력
	}
}
