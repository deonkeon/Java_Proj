package Exception_10.auto_close;

public class AutoCloseTest {		// 예외가 발생되지 않는 경우 (정상 처리)

	public static void main(String[] args) {	// try (resource) {} : 자동으로 close()
												// try with resource
		try(AutoCloseObj obj = new AutoCloseObj()/*(리소스블락)*/) {
			
		} 
		catch (Exception e){
			System.out.println("예외 블락 입니다. ");
		}
		System.out.println("프로그램 종료");
	}

}
