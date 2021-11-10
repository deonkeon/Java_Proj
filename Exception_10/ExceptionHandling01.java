package Exception_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling01 {	// try {} catch {} finally {}

	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			//fis = new FileInputStream("c.txt");
			fis = new FileInputStream("C:\\test\\c.txt");		//이클립스의 프로젝트 하위 - #C, test폴더 - C파일
		} catch (FileNotFoundException e) { // try{}블락에서 예외가 발생시 catch{}블락이 작동
			System.out.println(e);
			// e.printStackTrace();
			System.out.println("catch 블락 작동");
		} finally { // try{} 블락이 실행 되면 finally{}은 반드시 실행 (예외 발생과 상관없이 작동)
			System.out.println("finally 블락 실행");
			
		}
		System.out.println("프로그램 종료");

	}
}
