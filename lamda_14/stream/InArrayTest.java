package lamda_14.stream;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class InArrayTest {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5};
		
		int sum = 0;
		for (int i= 0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("직접 계산한 합은 : " + sum);
		
		System.out.println("=====스트림을 통한 값=====");
		
		int sumVal = Arrays.stream(arr).sum();	// 배열의 모든 값을 더한 값
		int count = (int) Arrays.stream(arr).count();	// 배열 방의 갯수를 리턴
		double avgVal = Arrays.stream(arr).average().getAsDouble();	// 배열 방의 평균 값을 리턴
		int minVal = Arrays.stream(arr).min().getAsInt();
		int MaxVal = Arrays.stream(arr).max().getAsInt();
		
		System.out.println(sumVal);
		System.out.println(count);
		System.out.println(avgVal);
		System.out.println(minVal);
		System.out.println(MaxVal);
	}

}
