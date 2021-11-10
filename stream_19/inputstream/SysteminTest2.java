package stream_19.inputstream;

import java.io.IOException;

public class SysteminTest2 {

	public static void main(String[] args) {
		System.out.println("알파벳 여러개를 쓰고 Enter를 누르세요 > ");
		
		int i ;
		
		try {
			
			while ((i = System.in.read()) != '\n') { // Enter를 넣으면 while문을 빠져 나옴
				System.out.println((char)i);
			}
			
			
			
			
		} catch (IOException e) {
			System.out.println(e);
			//e.printStackTrace();
		}
	}

}
