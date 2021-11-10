package stream_19.serialization;

import java.io.*; // java.io 하위 모든 내용(클래스) import 

class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6690655526646153686L;
	String name;				// 직렬화해서 (C:\Temp\student.dat)
	int id;						// 역직렬화 : 직렬화된 파일에서 변수의 값을 읽어옴
	String phoneNumber;			// 객체 3개 생성, 
	String email;
	
	public Student() {}
	public Student(String name, int id, String phoneNumber, String email) {
		this.name = name;
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	@Override
	public String toString() {
		return name + " , " + id + " , " + phoneNumber + " , " + email;
	}
	
}

public class Lab1_Serialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student kim = new Student("김구", 1, "1234" , "naver");
		Student lee = new Student("이재용", 2, "2345", "daum");
		Student song = new Student("송재익", 3, "3456", "nate");
		
		FileOutputStream fos = new FileOutputStream("C:\\Temp\\student.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(kim);
		oos.writeObject(lee);
		oos.writeObject(song);
		System.out.println("====직렬화 성공====");
		
		FileInputStream fis = new FileInputStream("C:\\Temp\\student.dat");
		ObjectInputStream ois =  new ObjectInputStream(fis);
		
		Student s1 = (Student) ois.readObject();
		Student s2 = (Student) ois.readObject();
		Student s3 = (Student) ois.readObject();
	
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
