package Exception_10.auto_close;

public class AutoCloseObj implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("리소스가 close(), 제거 되었습니다. ");
	}	
							// 자동으로 객체를 해제 하려면 AutoCloseable 인터페이스를 구현 해야한다.
							// close() 메소드를 오버라이딩(재정의) 구현 해야 한다.
							// try width resource 구문을 사용
}
