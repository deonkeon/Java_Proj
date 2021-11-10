package lamda_14.lamda;

@FunctionalInterface	// 함수형 인터페이스를 알려주는 어노테이션. 
						// 추상 메소드가 하나만 선언되어야 한다.
						// 함수형 인터페이스는 람다식에서 사용하도록 선언

public interface MyNumber {
	
	int getMax(int num1, int num2);
	
	//int getMax2(int num3, int num4);
}
