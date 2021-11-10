package ArrayType04;

import java.util.Calendar;

public class EnumType {

	public static void main(String[] args) {
		/*
		 * 열거 타입
		 *  public enum 열거타입이름{상수1이름, 상수2이름....} //선언
		 *  -데이타타입임
		 *  -상수는 주로 대문자로 사용
		 *  -허용가능한 값들을 제한
		 *
		 * 열거 타입 변수 : 
		 *  열거타입 변수;
		 *  예)Week week;
		 *
		 * 열거체이름.열거상수
		 *  예) week = Week.MONDAY
		 */
		Week today;
		today = Week.MONDAY;
		System.out.println("today="+Week.MONDAY);
		
		//name()메서드
		String name = today.name();
		System.out.println("name:"+name);
		//ordinal()메서드
		//전체열거 객체중 몇번째열거 객체인지 리턴
		System.out.println("ordinal:"+today.ordinal());
		
		//compareTo()메서드
		Week day1= Week.MONDAY;
		Week day2= Week.TUESDAY;
		
		int result = day2.compareTo(day1);
		System.out.println("result:"+result);
		
		//valueOf(매개변수) 메서드
		// 매개변수 값으로 주어지는 문자열과 동일한 문자열을 가지는 열거 객체리턴
		Week weekDay=Week.valueOf("SATURDAY");
		System.out.println("weekDay:"+ weekDay);
		
		Calendar cal = Calendar.getInstance();
		int wk = cal.get(Calendar.DAY_OF_WEEK);
		Week tday = Week.SUNDAY;
		switch(wk) {
			case 1: tday=Week.SUNDAY;break;
			case 2: tday=Week.MONDAY;break;
			case 3: tday=Week.TUESDAY;break;
			case 4: tday=Week.WENDESDAY;break;
			case 5: tday=Week.THRSDAY;break;
			case 6: tday=Week.FRIDAY;break;
			case 7: tday=Week.SATURDAY;break;
		}
		System.out.println("오늘의 요일:"+tday);
	}
}
