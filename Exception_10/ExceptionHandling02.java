package Exception_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling02 {	// catch {} 내에서 return;
									// finally는 catch{} 작동이 되면 return과 상관없이 반드시 실행
									// return이 finally 이후에 작동
	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("d.txt");
		} catch (FileNotFoundException e) { // try{}블락에서 예외가 발생시 catch{}블락이 작동
			System.out.println(e);
			// e.printStackTrace();
			System.out.println("catch 블락 작동");
			return;		// 프로그램 실행을 종료
		} finally { // try{} 블락이 실행 되면 finally{}은 반드시 실행 (예외 발생과 상관없이 작동)
			System.out.println("finally 블락 실행");	// try - finally(강제실행) - catch
			
		}
		System.out.println("프로그램 종료");

	}

}
