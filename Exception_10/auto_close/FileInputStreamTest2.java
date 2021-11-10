package Exception_10.auto_close;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {	// AutoClose 를 사용해서 객체 해제.

	public static void main(String[] args) {
			//FileInputStream은 Closable 인터페이스를 구현하고 있다.
		
		try (FileInputStream fis = new FileInputStream("c\\test\\input01")){
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
			//e.printStackTrace();
		} catch (IOException e1) {
			System.out.println(e1);
		}
		System.out.println("프로그램 종료");
	}

}
