package interface_08.lab02_Scheduler;

public interface Scheduler {	// 인터페이스 : 다형성 구성 예제
	void getNextcall();			// 추상메소드 : public abstract 생략됨, 다음 콜을 받아오는 메소드
	void sendcallToAgent();		// 추상메소드 : public abstract 생략됨, 콜을 에이전트에게 보내는 메소드
	
}
