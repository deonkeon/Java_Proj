package datetype01;

/*
 * 상수:저장된 값이 절대 변하지 않는 메모리의 한 종류
 * 선언방법:final 자료형 변수명= 초기값;
 * 상수 선언 후 중간에 값을 변경하면 에러
 * 변수명(상수명)은 보통 대문자로 선언한다.
 * 상수는 프로그램의 가독성을 높이며 유지 보수에도 유리하다.
 */
//*클래스안에서 선언된 변수를 멤버변수, 상수라 한다.
//메서드안에서 선언된 변수나 상수를 지역변수 혹은 지역상수라 한다.
public class ConstantVariable {
	//클래스안]
	//final double PI;[x] // 초기화를 안해서
	//반드시 초기화를 해야한다.
	//final double PI=3.14;
	static final double PI = 3.14; //static 메모리는 클래스 내에서 모두 사용가능
	//프로그램의 가독성을 높히기 위한 상수 선언
	static final int SCISSORS = 1; //
	static final int ROCK = 2;
	static final int PAPER = 3;	
	
	public static void main(String[] args) {
		double d1 = PI;
		//PI = 3.145;//[X] //상수는 변할 수 없는 값이기 때문
		
		final String NICK_NAME; //지역상수
		/*메소드(즉 지역)안에서 상수를 선언할때는 초기화를 사용전에만 해주면 된다.
		 * 보통 메소드(지역)안에서는 상수 선언을 안함 
		 * 주로 클래스안에서 상수 선언 함.
		 */
		//System.out.println(NICK_NAME);//[X] //초기화 안해서
		NICK_NAME = "자바";
		System.out.println(NICK_NAME);
		
		//NICK_NAME = "오라클";[X] // 변경 불가
		
		//가독성
		int computer=1, user=2; // 가독성이 떨어진다.
		
		computer=SCISSORS;
		user=ROCK;
		System.out.println("가독성이 높다");
		
		
	}
	public static void test() {
		double d1 = PI;
	}
}
