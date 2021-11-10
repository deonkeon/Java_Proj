package operator02;

public class NolliOP {

	public static void main(String[] args) {
		/*
		 * && : 논리합 ==> 조건문에서만 사용
		 * || : 논리곱 ==> 조건문에서만 사용
		 *  ! : 부정
		 *  ^,&,|:비트연산자(논리연산자)(XOR, AND, OR) 
		 *  
		 *  1] b1 && b2 : b1과 b2가 모두가 true일때만 true 이고 나머지는 false리턴
		 *  	단 b1이 false이면 b2는 무시하고(계산안하고) false를 리턴한다
		 *  2] b1 || b2 : b1과 b2가 모두가 false일때 false이고 나머지는 true리턴
		 *  	단 b1이 true이면 b2는 무시하고(계산안하고) true를 리턴한다
		 *  3] b1 & b2 : b1과 b2가 모두가 true일때만 true이고 나머지는 false리턴
		 *  	무조건 b1, b2를 수행한다.
		 *  4] b1 | b2 : b1과 b2 모두가 false일때 false이고 나머지는 true리턴
		 *  	무조건 b1, b2를 수행한다.
		 *  
		 *  5] ^,| 연산자가 &&, ||연산자보다 우선 순위가 높다. //^ : XOR (배타적 논리합) // | : OR 
		 */
		//boolean b1=(5>3) && (2>3);
		//System.out.println("b1:" + b1);
		//boolean b2=(5>3)||(5>2);
		//System.out.println("b2:" + b2);
		
		/* 
		 * 논리합
		 * false && false : false
		 * false && true : false
		 * true && false : false
		 * true && true : true
		 * 논리곱
		 * false || false : false
		 * false || true : true
		 * true || false : true
		 * true || true : true
		 * 예)
		 * false || true ^ false : true
		 * false || true : true
		 * true ^ false : true
		 * 예)
		 * false || false ^ false:true
		 * false || true : true
		 * ^(XOR) : 배타적논리곱(연산) // 연산자들이 다르면 true / 같으면 false
		 * true ^ false : true
		 * false ^ true : true
		 * true ^ true : false
		 * false ^ false : false
		 */
		boolean b1=(5>3) && (2>3);
		System.out.println("b1:" + b1);
		boolean b2=(5>3)||(5>2);
		System.out.println("b2:" + b2);
		
		boolean b3=!(5<2);
		System.out.println("b3:" + b3);
		
		System.out.println(true ^ false);
		System.out.println(true ^ true);
		
		int num1=100, num2=200;
		System.out.println(num1>100 && num2>100);//false
		System.out.println(num1>90 && num2>100);//true
		
		//단락회로평가
		num1 = 10;
		int i=2;
		//boolean b4=((num1=num1+10)<10) && ((i=i+2)<10);
		/*
		boolean b4=((num1=num1+10)<10) & ((i=i+2)<10);
		System.out.println("b4:"+b4);
		System.out.println(num1);
		System.out.println(i);
		*/
		//boolean b4 = ((num1=num1+10)>10) || ((i=i+2)<10);
		boolean b4 = ((num1=num1+10)>10) | ((i=i+2)<10);
		System.out.println("b4:"+b4);
		System.out.println(num1);
		System.out.println(i);
		
	}

}
