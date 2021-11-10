package stream_19.serialization;

import java.io.Externalizable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Animal implements Externalizable {
	String name;		// Externalizable 처리, C:\Temp\animal.dat
	int age;			// 객체 2개 직렬화 해서 저장, 읽어오기 // 사자:10, 호랑이:20
	public Animal() {}
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " , " + age;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		out.writeInt(age);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		age = in.readInt();
	}
	
}

public class Lab2_Externalizable {

	public static void main(String[] args) throws IOException {
		Animal lion = new Animal("사자", 10);
		Animal tiger = new Animal("호랑이", 20);
		
		FileOutputStream fos = new FileOutputStream("C:\\Temp\\animal.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(lion);
		oos.writeObject(tiger);
		
		System.out.println("===직렬화 성공===");
	}

}
