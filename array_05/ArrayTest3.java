package array_05;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		double[] data = new double[5];	//double 형 배열 변수 data에 방을 5개 생성
		
		int size =0;
		
		data[0] = 10.0; size++;
		data[1] = 20.0; size++;
		data[2] = 30.0; size++;
		
		System.out.println(data.length);	//배열변수의 방의 갯수를 출력
		
		double sum = 0.0;
		double total = 1.0;
		

		for (int i=0; i<data.length; i++) {
			System.out.println(data[i]);
			sum +=data[i];		//sum = sum + data[i]
		}
		System.out.println("총 합은 : " + sum);
		
		for(int i=0; i<size; i++) {
			total *= data[i];
		}	
		System.out.println("배열의 모든 수를 곱한 결과는 : " + total);
	}
	
}
