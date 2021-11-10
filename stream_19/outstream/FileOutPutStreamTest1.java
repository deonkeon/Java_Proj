package stream_19.outstream;

import java.io.FileOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileOutPutStreamTest1 {

	public static void main(String[] args) throws IOException {
		
		File file = new File ("C:\\Temp\\output.txt");
		file.createNewFile();	// 파일을 생성 
		
		try (FileOutputStream fos = new FileOutputStream ("C:\\Temp\\output.txt")) {
			
			fos.write(65);	// A
			fos.write(66);	// B
			fos.write(67);	// C
			
			
		} catch (IOException e) {
			System.out.println(e);
			//e.printStackTrace();
		}
		System.out.println("출력이 완료 되었습니다. ");
	}

}
