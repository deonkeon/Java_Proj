package ControlStatement03;

import java.io.IOException;
import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) throws IOException {
		/*
		 * switch 문: if문처럼 조건에 따라서 분기하는 제어문
		 * 
		 * 형식:
		 * 
		 * 정수식(산술식):연산의 결과값이 byte/short/int/char/String타입/enum타입으로
		 *   나오는 식 long형은 안됨
		 *   정수식은 산술식이거나 직접 변수를 정수식으로 사용하거나
		 *   예] num%4 혹은 num
		 * 
		 * switch(정수식) { //산술식,문자 (jdk1.5부터 문자열)
		 * 	 case 값1 :
		 *       명령문1;
		 *       break;
		 * 	 case 값2 :
		 *       명령문2;
		 *       break;
		 *  .............     
		 * 	 case 값n :
		 *       명령문n;
		 *       break;
		 *   [default :
		 *       명령문m;
		 *       [break;]
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요?");
		int inputNumber=sc.nextInt();
		System.out.println("입력한 숫자:"+inputNumber);
		int remain=inputNumber%3;
		System.out.println("[if문으로 나머지값 판단]");
		if(remain==0) System.out.println("나머지가0");
		else if(remain==1) System.out.println("나머지가1");
		else System.out.println("나머지가2");
		
		System.out.println("[switch문으로 나머지값 판단]");
		switch(remain) {
			case 0:
				System.out.println("나머지가0");
				break;
			case 1:
				System.out.println("나머지가1");
				break;
			default:
				System.out.println("나머지가2");
		}
		//switch문에는 정수식(산술식) 즉 결과값이 byte/short/int/char/String타입/enum타입만 허용
		// boolean값은 불가 즉 비교식이나 논리식 사용할 수 없다.
		//switch(inputNumber%3==0) {}//[x]
		byte b=3;
		switch(b) {
			case 1:
				System.out.println("b에 저장된 값1");
			case 2:
				System.out.println("b에 저장된 값2");
			case 3:
				System.out.println("b에 저장된 값3");
				/*
				 * break가 없는 경우:
				 * 먼저 해당 case를 찾고
				 * 다른 case의 명령문들도 모두 차례로 실행됨
				 * 그러므로 반드시 break를 추가해라
				 */
			case 4:
				System.out.println("b에 저장된 값4");
		}
		long ln=5;
		//switch(ln) {}[x]//long형은 안됨
		//switch(ln%5) {}[x]//결과가 long형 안됨
		
		//계산기 출력
		System.out.println("첫번째 숫자 입력?");
		int fnum=sc.nextInt();
		System.out.println("연산자 기호 입력(+,-,*,/)입력?");
		char op=(char)System.in.read();
		System.out.println("두번째 숫자 입력?");
		int snum=sc.nextInt();
		System.out.printf("fnum:%d,snum:%d,op:%c%n", fnum,snum,op);
		switch(op) {
			case '+':
				System.out.printf("%d + %d = %d%n", fnum,snum,fnum+snum);
				break;
			case '-':
				System.out.printf("%d - %d = %d%n", fnum,snum,fnum-snum);
				break;
			case '*':
				System.out.printf("%d X %d = %d%n", fnum,snum,fnum*snum);
				break;
			case '/':
				System.out.printf("%d / %d = %d%n", fnum,snum,fnum/snum);
				break;
		}
		
		String subject="수학";
		switch(subject) {
			case "국어" :
				System.out.println("과목은 국어");break;
			case "수학" :
				System.out.println("과목은 수학");break;
			
		}
		
		/*
		 * 여러 case를 동시에 처리할때는
		 * case 값1:
		 * case 값2:
		 * case 값n: 실행문n; break;
		 * 값1인경우, 값2인경우, 값n인경우에도 위의 실행문n이 실행됨
		 * 
		 */
		System.out.println("숫자를 입력하세요?");
		int inputNum = sc.nextInt();
		switch(inputNum) {
			case 1:
			case 2:
			case 100:
			case 200:
				System.out.println("1이거나 2이거나 100이거나 200중 하나");
				break;
			case 300:
				System.out.println(inputNum);
		}
		
		/*
		 * 문]평균을 구해서
		 * 90이상 "A학점"출력
		 * 80이상 "B학점"출력
		 * 60이상 "C학점"출력
		 * 60미만 "F학점"을 출력하여라
		 * 단, switch문 사용
		 */
		System.out.println("국어 점수 입력?");
		int kor = sc.nextInt();
		System.out.println("영어 점수 입력?");
		int eng = sc.nextInt();
		System.out.println("수학 점수 입력?");
		int math = sc.nextInt();
		
		int avg = (kor+eng+math)/30;
		switch(avg) {
			case 10:System.out.println("A학점");break;
			case 9:System.out.println("A학점");break;
			case 8:System.out.println("B학점");break;
			case 7:System.out.println("C학점");break;
			case 6:System.out.println("D학점");break;
			default:System.out.println("F학점");break;
		}
		
		/*
		 * 문] Gold, Silver, Bronze 문자열를 입력받아
		 * Gold "금메달입니다"출력
		 * Silver "은메달입니다"출력
		 * Bronze "동메달입니다"출력
		 * 기타 "메달이 없습니다"을 출력하여라
		 * 단, switch문 사용
		 */
		System.out.println("메달 색을 입력해 주세요.(Gold or Silver or Bronze)?");
		String medal = sc.next();
		
		switch(medal) {
			case "Gold":System.out.println("금메달입니다");break;
			case "Silver":System.out.println("은메달입니다");break;
			case "Bronze":System.out.println("동메달입니다");break;
			default:System.out.println("메달이 없습니다");
		}
			
	}////main

}//////////class
