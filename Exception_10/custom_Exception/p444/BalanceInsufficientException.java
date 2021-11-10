package Exception_10.custom_Exception.p444;

public class BalanceInsufficientException extends Exception {	// Exception 선언
	public BalanceInsufficientException() {}
	public BalanceInsufficientException(String message) {
		super(message);		//Exception 메세지를 입력
							//e.getMessage() detail message 출력
	}
}
