package interface_08.lab01;

public class Interface_Ex01 {

	public static void main(String[] args) {
		SmartPhone sm = new SmartPhone();
		sm.printLogo();
		sm.sendcall();
		sm.receivecall();
		sm.play();
		sm.stop();
		System.out.println("17과 38을 더하면 : "+sm.cal(17, 38));
		sm.schedule();
		sm.sendSMS();
		sm.receiveSMS();
		
		
		
	}/////main
}//////class

