package stream_19.decorator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {
	
		// C:\Temp\a.exe ==> C:\Temp\b.exe

	public static void main(String[] args) throws IOException {
		
		//FileInputStream : 바이트 스트림, 1바이트씩 읽어서 처리. (시간이 오래 걸림)
		FileInputStream fis = new FileInputStream("C:\\Temp\\a.exe");
		FileOutputStream fos = new FileOutputStream("C:\\Temp\\b.exe");
		
		long millisecond = 0; 		// 복사되는 전체 시간을 출력 (밀리세컨드)
		millisecond = System.currentTimeMillis();	// 현재의 시간을 밀리 세컨드 단위로 저장
		
		int i ;
		int j = 0;		// 총 바이트 
		while ( (i=fis.read()) != -1 ) {	// fis : 원본, 1바이트씩 읽음
			fos.write(i);					// fos : 복사 할 대상, 1바이트씩 출력
			j++;
		}
		
		
		millisecond = System.currentTimeMillis() - millisecond;		// 전체 복사 시간 (밀리세컨드)
		System.out.println("복사하는데 걸리는 시간은 : " + millisecond + "밀리세컨드 소요 되었습니다. ");
		System.out.println("총 복사한 바이트 수는 " + j + " 입니다. ");
		
	}

}
