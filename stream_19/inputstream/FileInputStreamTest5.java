package stream_19.inputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest5 {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("resource.txt");	// 읽어 오는 스트림
				FileOutputStream fos = new FileOutputStream ("resource.txt") // 저장하는 스트림
				) {
			
				//fos : resource.txt 파일에 쓰는 스트림
			fos.write(65);	// A
			fos.write(66);	// B
			fos.write(67);	// C
			fos.write(68);	// D
			fos.write(69);	// E
			fos.write(70);	// F
			
			
			// fis : resource.txt 파일에서 값을 읽어오는 스트림
			System.out.println((char)fis.read());	// byte 단위 (한글자) 씩 읽어옴
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			
		} catch (IOException e) {
			System.out.println(e);
			
		}
	}

}
