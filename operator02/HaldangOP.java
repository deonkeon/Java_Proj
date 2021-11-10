package operator02;

public class HaldangOP {

	public static void main(String[] args) {
		/*
		 * [할당(대입)연산자]
		 * =: 변수 = 값(변수)
		 * 오른쪽에 있는 값을 왼쪽의 변수에 할당(대입)한다.
		 * [복합대입연산자(축약표현)]
		 * +=, -=, *=. %=..등등
		 * 변수 += 값(변수2) => 변수1 = 변수1+값 혹은 변수1 = 변수1+변수2 // A=A+2 => A+=2
		 */
		//1]할당(대입)연산자
		int num1;//변수 선언
		//지역변수는 반드시 초기화 후 사용
		//int num2=num1+1;[x]초기화 안해서 오류
		num1 = 100;//값을 대입
		System.out.println(num1);
		int num2;
		num2 = num1;//변수 num1에 저장된 값을 대입
		System.out.println(num2);
		//10=num1;[x]
		
		//2]복합대입연산자(축약표현)
		//	산술연산자에만 적용
		num1 += 200; // num1 = num1 + 200;
		
		System.out.println(num1);
		//System.out.pritf("Null",args) ==> nul에는 문자열 넣고, args에 문자열에 올 변환지시어(변수값) 저장.
		
		System.out.printf("num1:%d, num2:%d%n", num1, num2); //==> %d 문자열 변환지시어
		
		num1 %= num2; //==> num2 / num1의 나머지 (num1이 num2보다 높을시 num2 그대로 출력), num2 = num2%num1;
		
		System.out.printf("num1:%d,num2:%d%n", num1, num2); //==> 변환지시어는 printf로 출력하기
		
		num2 *= 2+100; //num2 = num2*(2+100);
		System.out.printf("num2:%d%n", num2); //==> 100*102 = 10200;
		
		//num1 && = num;[x] //복합연산자는 산술연산만 적용가능, &&은 논리연산자임. (true or false)
		
		boolean b1=true, b2=false;
		System.out.println(b1&&b2);
		
		//b1 && = b2; 불가
		/*
		 * 증감연산자(단항연산자) : ++, --
		 * ++는 자기자신을 1증가시킨다.
		 * --는 자기자신을 1감소시킨다.
		 * 단독으로 쓰일때는 항이 증감연산자
		 * 앞에 붙거나 뒤에 붙거나 결과는 같다.
		 * 하지만 다른 연산자와 결합할 때는
		 * ++(--)변수:먼저 자신을 증감시킨다. ==> 변수먼저 증감하고 대입
		 * 변수++(--):다른연산을 수행한 후 자신을 증감시킨다. ==> 대입후 연산
		 */
		//단독으로 사용시]
		int num3=10;
		//변수++(후위 연산자) - 항뒤에 붙은 경우
		num3++; //num3 = num3 + 1
		System.out.println(num3);
		//변수++(전위 연산자) - 항앞에 붙은 경우
		++num3; 
		System.out.println(num3); //==> num3 = 11+1
		
		//다른 연산과 함께 사용시]
		int num4=10;
		int result = num4 + num3++; //==>후위연산자 (10+11)+1 = 22
		System.out.println(result);
		System.out.printf("num3:%d%n", num3);
		
		result = num4 + ++num3; //==>전위연산자 10+(13+1)=24
		System.out.println(result);
		System.out.printf("result:%d%n", result);
		
		int num5=10;
		System.out.println(num5++); //println가 먼저 출력을 시키기때문에 ++작용이안됨. 두번째부턴 적용되서 출력.
		System.out.println(num5);
		
	}

}
