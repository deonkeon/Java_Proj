package stream_19.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {	// 문자 스트림, 유니코드 (한글, 일본어, 중국어) 데이터를 처리

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("reader.txt");
		int i;
		while ( (i=fr.read()) != -1) {
			System.out.print((char)i);
		}
		fr.close();
		
		System.out.println();
		System.out.println("프로그램 종료");
	}

}
