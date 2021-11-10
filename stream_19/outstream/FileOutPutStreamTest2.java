package stream_19.outstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamTest2 {

	public static void main(String[] args) throws IOException {
		
		File file = new File ("C:\\Temp\\output2.txt");
		file.createNewFile();

		//FileOutputStream fos = new FileOutputStream("C:\\Temp\\output2");
		try (FileOutputStream fos = new FileOutputStream("C:\\Temp\\output2.txt")) {	// java 9 버젼부터 지원되는 기능
			byte [] bs = new byte [26];		// A~Z : 26자
			byte data = 65; // A
			
			for (int i = 0; i<bs.length; i++) {		// 배열의 A~Z까지 for 문을 사용해서 insert
				bs[i] = data;
				data ++;
			}
			
			fos.write(bs);		// 배열의 값을 한꺼번에 아웃풋 스트림을 사용해서 파일에 출력(저장)
			
		} catch (IOException e) {
			
		}
		System.out.println("출력이 완료 되었습니다. ");
	}

}
