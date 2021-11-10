package basic_class_11.class_ex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class strClass = Class.forName("java.lang.String");	// java lang안에 있는 String(객체) class파일(경로)
															// Compile 된 file
		Constructor[] cons = strClass.getConstructors();	// 매개변수를 뽑아옴(생성자)
		for (Constructor c : cons) {
			System.out.println(c);
		}
		System.out.println();
		Field[] fields = strClass.getFields();	// 필드, 완전한 원본을 보는 것이 아닌 input값을 보여줌
		for (Field f : fields) {
			System.out.println(f);
		}
		System.out.println();
		Method[] methods = strClass.getMethods();	// 메소드
		for (Method m : methods) {
			System.out.println(m);
		}
	}
}
