package object06.singleton;

public class CompanyTest {

	public static void main(String[] args) {
		
		//Company myCompany1 = new Company();	// Company () 생성자가 private 설정
												// 외부 클래스에서 호출 할 수 없다.
		//Company myCompany2 = new Company();
		
		Company myCompany1 = Company.getInstatce(); // static 키가 설정된 메소드
		Company myCompany2 = Company.getInstatce(); 
		
		System.out.println(myCompany1 == myCompany2);
		
		System.out.println(myCompany1);	//객체를 출력할 경우 객체의 주소값을 출력함.
		System.out.println(myCompany2);
	}

}
