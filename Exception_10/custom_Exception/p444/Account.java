package Exception_10.custom_Exception.p444;

public class Account {		// 사용자 정의 예외 발생
	private long balance;		// 잔고 (돈)
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit (int money) {		// 입금
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException {
		if (balance < money) {
			throw new BalanceInsufficientException("잔고부족:" + (money-balance)+" 모자람");
		}
		balance -= money;
	}
}
