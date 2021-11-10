package lamda_14.lamda.lab02;

@FunctionalInterface
interface PrintString {	// 람다식을 변수처럼 사용. (1. 변수에 값 대입, 2. 인풋 매개변수, 3. 리턴할 때)
	
	void showString(String str);	
}

public class LambdaTest {
	
	public static void showMyString (PrintString p) {
		p.showString("Hello Lambda_02");
	}
	public static PrintString returnString() {
		return s -> System.out.println(s + "Lambda_03");
	}
	
	public static void main(String[] args) {
		
		System.out.println("==1. 람다식을 변수에 대입==");
		
		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("Hello Lambda_01");
		
		System.out.println("==2. 메소드의 매개변수로 전달==");
		showMyString(lambdaStr);
		
		PrintString reStr = returnString();
		reStr.showString("Hello");
		
		
	}

}
