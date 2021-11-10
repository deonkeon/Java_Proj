package basic_class_11.class_ex;

public class ClassTest {	// 클래스 파일의 객체 전체 이름 알아오기 (패키지이름.클래스이름)

	public static void main(String[] args) throws ClassNotFoundException {
		Person person = new Person();
		Class pClass1 = person.getClass(); // Object클래스의 getClass() 메소드 사용
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;	// 직접 class 파일 대입
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("basic_class_11.class_ex.Person"); //클래스 이름으로 가져오기
		System.out.println(pClass3.getName());
		
		System.out.println(person.getClass());
	}

}
