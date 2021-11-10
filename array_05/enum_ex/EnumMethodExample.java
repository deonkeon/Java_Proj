package array_05.enum_ex;

public class EnumMethodExample {

	public static void main(String[] args) {
		//Enum 데이터 타입을 사용하는 객체는 java.lang.Enum 클래스를 상속 받는다.
			//java.lang.Enum 클래스의 메소드를 사용할 수 있다.
		//name() 메소드 : 열거 객체가 가지고 있는 문자열을 리턴한다.
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		//ordinal() 메소드 : 전체 열거 객체중 몇번째 열거 객체인지 알려준다. (인덱스 번호를 알려줌)
		
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//compareTo() 메소드 : 매개값으로 주어진 열거 객체를 기준으로 전후 몇번째에 위치하는지 비교.
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		
		//valueOf() 메소드 : 매개값으로 주어지는 문자열과 동일한 문자열을 가지는 열거 객체를 리턴
		if (args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if (weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말이군요.");	//오른쪽클릭 run as - run configurations - argument에서 조건 넣고 reply&run
			} else {								//매개변수값을 던져줌 - args[0]에 들어감.
				System.out.println("평일이군요.");
			}
		}
		/*
		String arg0 = args[0];
		String arg1 = args[1];
		String arg2 = args[2];
		String arg3 = args[3];
		System.out.print(arg0 + " " + arg1 + " " + arg2 + " " + arg3 + " " );
		*/
		//values() 메소드 : 모든 열거 객체들을 배열을 만들어 리턴한다.
		Week[] days = Week.values();
		for (Week day : days) {
			System.out.println(day);
		}
		
		
		
	}

}
