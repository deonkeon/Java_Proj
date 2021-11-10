package stream_19.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Lab2_ExternalizalbeTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("C:\\Temp\\animal.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Animal lion =  (Animal) ois.readObject();
		Animal tiger = (Animal) ois.readObject();
		
		System.out.println(lion);
		System.out.println(tiger);
	}

}
