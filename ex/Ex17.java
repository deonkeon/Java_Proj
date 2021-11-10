package ex;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = {"가위", "바위", "보"};
		String userSelect, comSelect;
		int n;		// 랜덤 함수에서 발생하는 값을 저장, 컴퓨터가 내는 것.
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		do {
			System.out.println("가위, 바위, 보 >> ");
			userSelect = sc.next();
			if(userSelect.equals("그만")) break;
			n = (int)(Math.random() *3);	// 컴퓨터에서 랜덤한 값 : 0,1,2
			comSelect = str[n];	//가위[0], 바위[1], 보[2]
			
			if(userSelect.equals("가위")) {
				if (comSelect.equals("가위")) {
					System.out.println("사용자 = " + userSelect + ", 컴퓨터 = " + comSelect + " 비겼습니다.");
					continue;
				}
				if (comSelect.equals("바위")) {
					System.out.println("사용자 = " + userSelect + ", 컴퓨터 = " + comSelect + " 졌습니다.");
					continue;
				}
				if (comSelect.equals("보")) {
					System.out.println("사용자 = " + userSelect + ", 컴퓨터 = " + comSelect + "이겼습니다.");
				}	continue;
			}
			else if(userSelect.equals("바위")) {
				if (comSelect.equals("가위")) {
					System.out.println("사용자 = " + userSelect + ", 컴퓨터 = " + comSelect + " 이겼습니다.");
					continue;
				}
				if (comSelect.equals("바위")) {
					System.out.println("사용자 = " + userSelect + ", 컴퓨터 = " + comSelect + " 비겼습니다.");
					continue;
				}
				if (comSelect.equals("보")) {
					System.out.println("사용자 = " + userSelect + ", 컴퓨터 = " + comSelect + "졌습니다.");
				}	continue;
				
			}
			else if(userSelect.equals("보")) {
				if (comSelect.equals("가위")) {
					System.out.println("사용자 = " + userSelect + ", 컴퓨터 = " + comSelect + " 졌습니다.");
					continue;
				}
				if (comSelect.equals("바위")) {
					System.out.println("사용자 = " + userSelect + ", 컴퓨터 = " + comSelect + " 이겼습니다.");
					continue;
				}
				if (comSelect.equals("보")) {
					System.out.println("사용자 = " + userSelect + ", 컴퓨터 = " + comSelect + "비겼습니다.");
				}	continue;
				
			}

			//System.out.println("사용자 = " + userSelect + ", 컴퓨터 = " + comSelect);
			
			
		}while(true);
		System.out.println("가위바위보를 종료합니다");
		sc.close();
	}

}
