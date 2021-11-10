package Exception_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling04 {	// 여러 개의 Exception 처리

	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("e.txt");
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println(e);
			System.out.println("catch 블록 작동");
			return;
		} finally {
			System.out.println("fianlly 블록 실행");
			
			//if (fis != null) {
				try {
					fis.close(); // 객체를 메모리에서 제거(예외 처리 필요)
					System.out.println("객체 정상 메모리에서 제거");
				} catch (IOException | NullPointerException e) {
					System.out.println("객체 정상 메모리에서 제거 안됨 (Null)");
					//e.printStackTrace();
				}
			//} 
			System.out.println("프로그램 종료");
		}
	}

}
