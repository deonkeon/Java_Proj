package stream_19.other;

import java.io.Console;

public class ConsolTest {	// 명령프롬프트에서 입력을 받도록 함. 명령 프롬프트에서 실행.
							// JVM 1.8 까지만 작동
			// 출력시 주의 할점.
			// 컴파일 된 bin 폴더에서 명령어를 실행해야함
			// java 전체패키지이름.클래스이름 ex) > stream_19.other.consoleTest

	public static void main(String[] args) {
		Console console = System.console();	// java.io.Console	
		
		System.out.println(" 이름을 입력하세요. ");
		String name = console.readLine();	
		System.out.println(" 직업을 입력하세요. ");
		String job = console.readLine();
		System.out.println(" 비밀 번호를 입력하세요. ");
		char [] pass = console.readPassword();	// readPassword() : 화면에 노출되지 않음.
		String strPass = new String(pass);		// pass 배열의 값을 String으로 변환
		
		System.out.println("========출력 구문=========");
		System.out.println(name);
		System.out.println(job);
		System.out.println(strPass);
		
	}

}
