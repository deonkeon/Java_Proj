package inheritance_07.abstract_calc;

public class Calcex extends Calculator {
	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int substract(int a, int b) {
		return a - b;
	}

	@Override
	public double avg(int[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum / a.length;
	}

	@Override
	public int times(int[] b) {
		int t = 1;
		for (int i = 0; i < b.length; i++) {
			t *= b[i];
		}
		return t;
	}

	public static void main(String[] args) {
		Calcex c = new Calcex();
		int[] arr = { 4, 5, 6, 7, 8, 9, 10 };
		int[] arr1 = new int[5];
		arr1[0] = 87;
		arr1[1] = 77;
		arr1[2] = 98;
		arr1[3] = 65;
		arr1[4] = 57;

		System.out.println(c.add(10, 9));
		System.out.println(c.substract(10, 14));
		System.out.println(c.avg(arr1));
		System.out.println(c.times(arr));

	}//// main
}///// class
