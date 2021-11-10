package stream_19.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {

		//FileInputStream fis = new FileInputStream("input.txt");
		
		//FileInputStream fis = new FileInputStream("C:\\Temp\\input.txt");
		
		FileInputStream fis = null;
		
		try {
			//fis  = new FileInputStream ("input.txt");	// 반드시 예외 처리 (FileNotFoundException)
			fis = new FileInputStream("C:\\Temp\\input.txt");	// (경로를 찾아가 file을 읽음)
			
			System.out.println((char)fis.read());		// 1바이트 읽어와서 출력
			System.out.println((char)fis.read());		// 1바이트 읽어와서 출력
			System.out.println((char)fis.read());		// 1바이트 읽어와서 출력
			
		} catch (IOException e) {		// IOException은 FileNotFoundException 의 상위 Exception
			System.out.println(e);
			//e.printStackTrace();
		} finally {
			try {
				fis.close();			// 반드시 예외 처리
			} catch (IOException e) {	
				//e.printStackTrace();
				System.out.println(e);
			}	
		}
		
		System.out.println("End (프로그램 종료)");
		
	}

}
