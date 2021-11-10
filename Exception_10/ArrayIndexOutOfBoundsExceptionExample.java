package Exception_10;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		try {
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0]: " + data1);
		System.out.println("args[1]: " + data2);
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println(e);
			System.out.println("catch 블락 호출");
		}
		System.out.println("프로그램 종료");
	}

}
