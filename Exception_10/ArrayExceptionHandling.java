package Exception_10;

public class ArrayExceptionHandling {

	public static void main(String[] args) {
		int[] arr = new int [5];	// 배열의 방 5개 생성
		
		for(int i=0; i<=5; i++) {	// Exception 발생. 배열의 방번호를 넘겨 버림.
			arr[i] = i;				// ArrayIndexOutOfBoundsException : 배열의 방번호를 넘겨버렸을 때 발생
			System.out.printf("%-2d",arr[i]);
		}
	}

}
