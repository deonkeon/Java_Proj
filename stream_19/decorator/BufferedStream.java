package stream_19.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStream {

	public static void main(String[] args) throws IOException {
		// C:\Temp\a.exe ==> C:\Temp\c.exe (BufferedStream 사용 : RAM 8KB 처리)
		// BufferedStream : 보조 스트림, RAM 사용, 8KB처리
		
		FileInputStream fis = new FileInputStream("C:\\Temp\\a.exe");	// 기반스트림
		FileOutputStream fos = new FileOutputStream("C:\\Temp\\c.exe");	// 기반스트림
		
		BufferedInputStream bis = new BufferedInputStream(fis);			// 보조스트림
		BufferedOutputStream bos = new BufferedOutputStream(fos);		// 보조스트림
		
		long millisecond = 0;
		millisecond = System.currentTimeMillis();	// 복사전 시스템의 시간을 밀리세컨드 단위로 저장
		
		int i;
		int j=0;
		while ( (i=bis.read()) != -1 ) {	// 8KB씩 읽음
			bos.write(i);
			j++;
		}
		
		millisecond = System.currentTimeMillis() - millisecond;			// 전체 복사 시간
		System.out.println("복사하는데 걸리는 시간은 : " + millisecond + "밀리세컨드 소요 되었습니다. ");
		System.out.println("총 복사한 바이트 수는 " + j + " 입니다. ");
		
	}

}
