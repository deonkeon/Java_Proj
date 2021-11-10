package interface_08;

public interface PhoneInterface2 {
	int timeout = 10000; // public static final 생략 가능
	void sendcall(); // public abstract
	void receivecall(); // public abstract
	default void printLogo() {System.out.println(" 로고 ");} // public
}
