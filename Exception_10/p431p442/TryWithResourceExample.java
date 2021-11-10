package Exception_10.p431p442;

public class TryWithResourceExample { 	// try 블록이 정상적으로 실행되거나 도중에 예외가 발생하면 자동으로 close() 메소드 호출.
										// try {}에서 예외가 발생하면 우선 close()로 리소스 닫고 catch 블록 실행

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception(); // 강제적으로 예외 발생시킴
		} catch (Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다."); 
		}
	}

}
