package stream_19.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest4 {

	public static void main(String[] args) throws IOException {

		try (FileInputStream fis = new FileInputStream ("Input2.txt") ) {
			byte [] bs = new byte [10];
			int i;
			
			while ( (i = fis.read(bs, 0, 10)) !=-1) {
				for (int k = 0; k < i; k++) {
					System.out.print((char) bs[k]);
				}
				System.out.println(" : " + i + "바이트 읽음");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
