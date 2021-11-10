package interface_08.lab01;

public interface Phone1 {
		int timeout = 10000;
		void sendcall();
		void receivecall();
		default void printLogo() {System.out.println(" 로고 ");}
		
	}
