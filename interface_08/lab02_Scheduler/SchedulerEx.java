package interface_08.lab02_Scheduler;
import java.io.IOException;


public class SchedulerEx {

	public static void main(String[] args) throws IOException {
		System.out.println("전화 상담의 할당방식을 선택하세요");
		System.out.println("R : 한명씩 차례로 할당");
		System.out.println("L : 대기중인 상담원에게 할당");
		System.out.println("P : 우선순위가 가장 높은 고객에게 할당");
		System.out.println("선택 >>");
		
		int ch = System.in.read();	//예외처리 필요
		Scheduler sc = null;		//Scheduler 객체 선언
		
		if(ch == 'R' || ch == 'r') {sc = new RoundRobin();}
		else if(ch == 'L' || ch == 'l') {		// 업캐스팅
			sc = new LeastJob();
		}
		else if(ch == 'P' || ch == 'p') {		// 업캐스팅
			sc = new PriorityAllocation();
		}
		else {System.out.println("지원되지 않는 방식입니다.");
			  return;
		}
		
		sc.getNextcall();		// 메소드 호출
		sc.sendcallToAgent();
		
		
	}///main
}/////class
