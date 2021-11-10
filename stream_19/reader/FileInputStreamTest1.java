package stream_19.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 {
			// 바이트 스트림, 한글인 경우 글자가 다 깨어져서 출력, 영문인 경우 아스키 코드로 저장.
			// 1. 한글인 경우 문자스트림으로 처리 (FileReader)
			// 2. 보조스트림으로 처리

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		fis = new FileInputStream("reader.txt");
		
		int i;
		while ((i=fis.read()) != -1) {		// 파일의 마지막까지 (-1) : EOF
			System.out.println((char)i);
		}

		fis.close();
		System.out.println("프로그램 종료");
	}

}
