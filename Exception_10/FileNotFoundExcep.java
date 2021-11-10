package Exception_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFoundExcep {
		// 예외 처리 : 1. throws로 처리 - 예외를 미루는 것
				// 2. try ~ catch : 
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		
		try {
			fis = new FileInputStream("b.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);	// 오류 정보를 간략하게 출력
			e.printStackTrace();	// 오류 정보를 아주 자세하게 출력 (코드가 아니고 정보를 출력)
			System.out.println("catch 블락 호출");
		}
		System.out.println("프로그램 종료");
		
		
	}

}
