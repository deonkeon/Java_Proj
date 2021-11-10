package generic_12.ex02;

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(5);	// index 0
		v.add(4);	// index 1
		v.add(-1);	// index 2
		
		v.add(2,100);	// index 2에 100을 삽입 (4와 -1사이에 정수 100을 삽입)
		
		System.out.println("백터내의 요소 개체는 " + v.size());
		System.out.println("백터의 현재 용량 " + v.capacity());
		
		// 모든 요소의 정수 출력 하기
		for (int i = 0; i<v.size(); i++) {
			int n = v.get(i);
			System.out.print(n + " ");
		}
		System.out.println();
		// 백터내의 모든 요소를 더하기
		int sum = 0;
		for (int i = 0; i<v.size(); i++) {
			int n = v.get(i);
			sum += n;
		}
		System.out.println("백터에 있는 정수의 합은 : " + sum);
	}
}
