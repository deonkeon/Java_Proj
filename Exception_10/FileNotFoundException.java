package Exception_10;

import java.io.FileInputStream;

public class FileNotFoundException {	// FileNotFoundException : 파일의 경로로 찾을 수 없을 경우 예외처리

	public static void main(String[] args) {
		FileInputStream fis = null;		// 파일에서 값을 읽어오는 스트림
		
		try {
			fis = new FileInputStream("a.txt");
		} catch (Exception e) {			
			System.out.println(e);		//오류 정보를 출력하라
			System.out.println("예외 발생함");
		}
		System.out.println("프로그램 정상 종료");
	}

}
