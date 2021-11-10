package interface_08.lab01;

public interface MobilePhoneinterface extends Phone1{
			//interface가 interface를 상속 : extends
	
	//void sendcall();		// 상속으로 내려옴
	//void receiveCall();	// 상속으로 내려옴
	void sendSMS();			// 추상메소드
	void receiveSMS();		// 추상메소드
	
}

