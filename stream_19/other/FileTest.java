package stream_19.other;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		
		File file = new File ("C:\\Temp\\newFile.txt");
				// File : 파일 생성, 속성을 알려줌.
		file.createNewFile(); 	// 지정된 경로에 파일을 생성해 주는 File클래스의 createNewFile();
		
		System.out.println(file.isFile());		// 파일이 지정된 경로에 존재하면 True, 없으면 false
		System.out.println(file.isDirectory());	// 폴더(True), 파일(False)
		System.out.println(file.getName());		// 파일 이름을 가져온다.
		System.out.println(file.getAbsolutePath());	// 파일이 저장되어 있는 곳의 절대 경로 출력
									// C:\Temp\newFile.txt => drive부터 지정되어 모든 경로가 나옴
									// 절대경로 : 
									// Windows : C:\, D:\
									// Linux : /(루트)부터 경로가 정의됨
				
		System.out.println(file.getPath());	// 파일이 저장되어 있는 곳의 경로
									// 상대 경로 : 특정 폴더를 기준으로 출력
		
		
		System.out.println(file.canRead());	// 읽을 권한이 있는가?
		System.out.println(file.canWrite());
		
		file.delete();
		System.out.println(file.isFile());
		
	}

}
