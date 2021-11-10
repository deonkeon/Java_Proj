package Exception_10.throws_ex;		// 다중 catch 처리

import java.io.FileInputStream;
import java.io.FileNotFoundException;		//동적 로딩 : 실행시에 확인 : Class.getClass();

public class ThrowsException04 {	// throws : 예외를 미루는 것, 호출하는 곳에서 예외 처리를 해야함.
	
	public Class loadClass (String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);		//클래스의 전체 이름을 받아서 존재하는지 확인
		return c;		//Class.forName(전체클래스) : 동적로딩이 지원
						//동적로딩 : 컴파일시에 이름을 확인하는 것이 아닌 실행시에 이름 확인.(바로 적용 x 필요시 호출 사용 및 적용)
	}

	public static void main(String[] args) {
		ThrowsException04 test = new ThrowsException04();	// throws Exception을 처리하는 객체 생성
		
		
		/*try {	// Multi-catch : 두개의 Exception에 대해서 하나로 처리
			test.loadClass("a.txt", "java.lang.String1");
		} catch (FileNotFoundException | ClassNotFoundException e) {
			System.out.println(e);
			//e.printStackTrace();
		}*/
	
		try {	// Surround catch : 각각의 Exception에 대해서 각각 처리
			Class d = test.loadClass("C:\\test\\g.txt", "java.lang.String2");
			System.out.println(d.getClass());	// 호출시 Exception 처리
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("파일이 없습니다.");
			System.out.println("클래스 파일이 없습니다.");
		
		}
		System.out.println("프로그램 종료");
	}
}

