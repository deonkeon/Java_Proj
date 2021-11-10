package lamda_14.lamda.calc;

public class ArithmeticOperationComp implements ArithmeticOperation {

	@Override
	//public void ArithmeticOper(double a, double b) {
	public void ArithmeticOper(int a, int b) {

		System.out.println("a + b = " + (a+b));
		System.out.println("a - b = " + (a-b));
		System.out.println("a * b = " + (a*b));
		System.out.println("a / b = " + (a/b));
	}



}
