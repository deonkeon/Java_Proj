package Exception_10;

public class ArrayExceptionHandling02 {

	public static void main(String[] args) {	// try에서 예외가 발생되지 않을 경우 catch 블락은 작동되지 않음.
		int[] arr = new int[5];
		
		try {
			for (int i=0; i<5; i++) {
				arr[i] = i;				// 각방에 값을 추가
				System.out.printf("%-2d", arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e){
			//System.out.println(e);			// 오류코드를 출력해라
			System.out.printf("\r\n%s\r\n", "예외 처리 부분");
		}
		System.out.println();
		System.out.println("프로그램 정상 종료");
	}
}


