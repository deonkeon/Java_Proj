package operator02;

public class BitOP {

	public static void main(String[] args) {
		//비트 연산은 비트 단위로 계산
		/*
		 * 논리합(&)
		 * 0 & 0 : 0 ==> 같으면 0, 다르면 1을 실행
		 * 0 & 1 : 0
		 * 1 & 0 : 0
		 * 1 & 1 : 1
		 * 논리곱(|)
		 * 0 | 0 : 0
		 * 0 | 1 : 1
		 * 1 | 0 : 1
		 * 1 | 1 : 1
		 * 
		 * [쉬프트(shift) 연산자(이항연산자)]
		 * -두 항이 반드시 정수여야한다.
		 * 정수 << 비트수 : 왼쪽으로 비트수만큼 이동하고
		 * 				오른쪽에 남은 비트는 0으로 채운다.
		 * 
		 * 정수 >> 비트수 : 오른쪽으로 비트수만큼 이동하고
		 * 				왼쪽에 남은 비트는 부호비트로채운다(1:음수, 0:양수)
		 */
		byte num1=45; //==> 00101101 
		byte num2=25; //==> 00011001
		//byte result = num1&num2;[x] //==>int로 계산됨
		int result = num1&num2; //==> 00001001 = 9 (값이 같을때 1(true), 값이 다를때 0(false) 
		System.out.println(result);
		
		byte b1=10, bit1=2;
		result = b1 << bit1;  // 00001010 왼쪽으로 2비트만큼 이동하고 나머지0 채움 // 00101000 = 40
		System.out.println(result); // 2진수 맨앞이 0일때는 양수, 1일때는 음수
		
		b1=-9;
		result=b1>>bit1; //==> 10001001 ==> 2의 보수 사용 ==> 11110110(+1) ==> 11110111(보수) 
						 //==> 2만큼 우측이동 ==> 11111101 ==> 다시역으로 보수계산(1빼고 보수계산) ==> 11111100 ==> 10000011(-3)
		System.out.printf("%d>>%d의 결과: %d%n", b1,bit1,result);
		
		b1=-3;
		bit1=3;
		result = b1>>>bit1; //>>>는 맨앞 부호비트가 0이됌
		System.out.printf("%d>>>%d의 결과: %d%n", b1,bit1,result);
		
		
	}

}
