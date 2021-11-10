package interface_08.lab02_Scheduler;
import java.util.Scanner;


public class SchedulerEx02 {

	public static void main(String[] args) {
		boolean run = true;
		Scanner x = new Scanner(System.in);
		while(run) {
		System.out.println("전화 상담의 할당방식을 선택하세요");
		System.out.println("R : 한명씩 차례로 할당");
		System.out.println("L : 대기중인 상담원에게 할당");
		System.out.println("P : 우선순위가 가장 높은 고객에게 할당");
		System.out.println("선택 >>");
		
		String ch = x.next();
		if(ch.equals("그만")) {break;}
		Scheduler sc = null;
		
		if(ch.equals("R") || ch.equals("r")) {sc = new RoundRobin();}
		else if(ch.equals("L") || ch.equals("l")) {sc = new LeastJob();}
		else if(ch.equals("P") || ch.equals("p")) {sc = new PriorityAllocation();}
		else {System.out.println("지원되지 않는 타입입니다.");
			  return;}
		
		sc.getNextcall();
		sc.sendcallToAgent();}
		
		System.out.println("종료합니다.");
		x.close();
		
		
	}////main
}//////class

