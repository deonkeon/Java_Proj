package ex.chap05;
import java.util.Scanner;
public class _09 {

	public static void main(String[] args) {
		boolean run = true;		// 종료 전까지 루프
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("================================================");
			System.out.println("1.학생수 | 2.점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("================================================");
			System.out.print("선택> ");	
			
			int selectNo = sc.nextInt();
			
			if (selectNo == 1) {	// 학생수를 입력 받고, 배열의 크기를 입력 받은 학생수로 지정. 
				System.out.print("학생수> ");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
				
			} else if (selectNo == 2) {		// 각각의 배열 방에 학생들의 점수를 입력
				for(int i = 0; i<scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = sc.nextInt();
				}
				
			} else if (selectNo == 3) {		// 배열의 정보들을 출력
				for(int i = 0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
				
			} else if (selectNo == 4) {		// 총합, 최대값, 평균 출력
				int sum = 0;
				int max = 0;
				double avg = 0;
					
				for(int i = 0; i<scores.length; i++) {
					sum += scores[i];
					if(scores[i]>max) {
						max = scores[i];
						
					}
				}
				avg = (double)sum/scores.length;
				System.out.println("최고 점수:" + max);
				System.out.println("평균 점수:" + avg);
		
			} else if (selectNo == 5) {
				run = false;
				sc.close();
			}
			
		}	
		System.out.println("프로그램 종료");
		
	}
}