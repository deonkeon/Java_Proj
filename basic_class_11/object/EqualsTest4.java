package basic_class_11.object;

import java.util.Objects;

class MyDate{
	int day;
	int month;
	int year;
		//1. toString 메소드를 재정의 : "2021년, 09월,27일 입니다. "
		//2. equals 메소드 재정의 : 두개의 객체를 만들어서 년, 월, 일이 같을 때 : True를 return
		//3. hashCode 메소드 재정의 : 일 + 월 + 년도
	
	public MyDate() {}
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return year + "년, " + month + "월, " + day + "일 입니다. ";
	}

	@Override
	public boolean equals(Object obj) {		//매개변수가 obj로 업캐스팅 되어서 들어옴
		if(obj instanceof MyDate) {
			MyDate my = (MyDate) obj;		//obj를 MyDate 타입으로 다운캐스팅
			if(this.day == my.day && this.month == my.month && this.year == my.year) {
				return true;
			} else {
				return false;
			}
		}
		
		return false;		// 조건에 맞다면 true 아니라면 false (기본적으로 false설정)
	}
	@Override
	public int hashCode() {
		return Objects.hash(day,month,year);		//Objects.hash() <== hash 코드를 생성해줌
	}
	
	
}

public class EqualsTest4 {
	public static void main(String[] args) {		
		MyDate date1 = new MyDate(28,9,2021);		//생성자를 통해서 값 할당
		System.out.println(date1);
		
		MyDate date2 = new MyDate();		//직접 객체에 값을 할당
		date2.day = 28;
		date2.month = 9;
		date2.year = 2021;
		System.out.println(date2);
		
		MyDate date3 = new MyDate();		//Setter를 통해서 값 할당
		date3.setDay(29);
		date3.setMonth(9);
		date3.setYear(2021);
		System.out.println(date3);
		
		System.out.println(date1.equals(date2));
		System.out.println(date1.equals(date3));
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
		System.out.println(date3.hashCode());
	}

}
