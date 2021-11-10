package stream_19.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadSerializationTest {	// 파일에 저장된 객체를 읽어서 출력

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("C:\\Temp\\serial.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Person p1 = (Person) ois.readObject();
		Person p2 = (Person) ois.readObject();
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
