

public class EscapeChar {
	public static void main(String[] args) {
		/*
		 * Escape문자
		 * 문자열 내에서 특수한 기능을 수행하는 문자(특수한 의미로 해석 되는 문자)
		 */
		//예]
		System.out.println("Hit HomeRun");
		System.out.println("Hit\t HomeRun");
		//1]\n: 줄바꿈(line feed)기능
		System.out.println("Hit HomeRun");
		System.out.println("Hit\n HomeRun");
		System.out.println("\nHit HomeRun");
		//2]\r:커서를 해당 줄에서 맨 처음으로(carrage return)
		System.out.println("My NickName is superMan\rxx");
	}
	
}
