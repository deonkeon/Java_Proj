package stream_19.serialization;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ExternalizableReadTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("C:\\Temp\\dog.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Dog myDog = (Dog) ois.readObject();
		Dog yourDog = (Dog) ois.readObject();
		
		System.out.println(myDog);
		System.out.println(yourDog);
	}

}
