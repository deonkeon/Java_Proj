package generic_12.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {	//이름을 4개 입력 받아 ArrayList에 저장하고 제일 긴이름을 출력
		ArrayList<String> a = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		// 4명의 이름을 입력 받아서 ArrayList에 저장
		for (int i = 0; i<4; i++) {
			System.out.println("이름을 입력하세요. ");
			String inputName = sc.next();
			a.add(inputName);
		}
		// ArrayList에 저장된 모든 이름 출력
		for(int i = 0; i<a.size(); i++) {
			String printName = a.get(i);
			System.out.print(printName + " ");
		}
		System.out.println();
		// 가장 긴 이름을 출력
		int longnameIndex = 0;		// 가장 긴 이름을 저장한 방 번호(index)
		for (int i =0; i<a.size(); i++) {
			if(a.get(longnameIndex).length() < a.get(i).length()) {
				longnameIndex = i;
			}
		}
		System.out.println("가장 긴 이름은 : " + a.get(longnameIndex));
		System.out.println("==============각 방의 글자 길이는=================");
		System.out.println(a.get(0) + " : 0번 방의 글자 길이는 " + a.get(0).length());
		System.out.println(a.get(1) + " : 1번 방의 글자 길이는 " + a.get(1).length());
		System.out.println(a.get(2) + " : 2번 방의 글자 길이는 " + a.get(2).length());
		System.out.println(a.get(3) + " : 3번 방의 글자 길이는 " + a.get(3).length());
	}

}
