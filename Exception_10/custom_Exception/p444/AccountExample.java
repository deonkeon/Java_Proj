package Exception_10.custom_Exception.p444;

public class AccountExample {	// 실행코드

	public static void main(String[] args) {
		Account account = new Account();
		//예금하기
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());
		//출금하기
		try {
			account.withdraw(30000); // 예외 발생, 떠넘김
		} catch (BalanceInsufficientException e) { 
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();

		}	
	}

}
