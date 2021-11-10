package array_05.enum_ex;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		
		Week today = null;
		Calendar cal = Calendar.getInstance();	//메소드를 호출해서 사용, 객체 생성, 싱글톤
						// getInstance() 메소드는 static으로 설정.
		int week = cal.get(Calendar.DAY_OF_WEEK);	//  요일을 숫자로 출력
						// 일요일 (1), 월(2) .... 토(7)
		System.out.println(week); 
		
		switch (week) {
		case 1 : today = Week.SUNDAY; break;
		case 2 : today = Week.MONDAY; break;
		case 3 : today = Week.TUESDAY; break;
		case 4 : today = Week.WEDNESDAY; break;
		case 5 : today = Week.THURSDAY; break;
		case 6 : today = Week.FRIDAY; break;
		case 7 : today = Week.SATURDAY; break;
		}
		System.out.println( "오늘의 요일은 : " + today + "입니다. ");
		
		if ( today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다. ");
		} else {
			System.out.println("열심히 자바 공부를 합니다. ");
		}
	}

}
