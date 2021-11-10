package collection.arraylist;

import java.util.ArrayList;

class MyStack {
	private ArrayList<String> arrayStack = new ArrayList<String>();
	// Stack 자료 구조에 값을 할당 : push 
	public void push (String data) {
		arrayStack.add(data);
	}
	// Stack 자료 구조에서 값을 빼내오는 것 : pop
	public String pop() {
		int len = arrayStack.size();	// ArrayList에 저장된 방의 갯수
		if(len == 0) {
			System.out.println("스택이 비어 있습니다. ");
			return null;
		}
		return (arrayStack.remove(len -1));	// 마지막 방의 값을 제거함.
	}
	public void showAll() {
		for (int i=0; i< arrayStack.size(); i++) {
			String a = arrayStack.get(i);
			System.out.println(a + " index : " + i);	// 객체 안의 문자열을 출력
		}
	}
}

public class StackTest {	// 자료 구조 : LIFO (Last In First Out)
							// 마지막에 들어간 값이 제일 먼저 출력되는 자료 구조, 예) 바둑의 무르기

	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		
		// Stack 자료형에 값을 할당.
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		
		stack.showAll();
		System.out.println("======================");
		
		System.out.println(stack.pop());	// 마지막 방의 값을 삭제
		stack.showAll();
		
		System.out.println("======================");
		
		System.out.println(stack.pop());	// 마지막 방의 값을 삭제
		stack.showAll();
	}

}
