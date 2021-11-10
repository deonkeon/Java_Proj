package interface_08.lab02_Scheduler;

public class PriorityAllocation implements Scheduler{
	//고객 등급이 높은 순서대로 업무능력이 높은 상담원을 우선 배정

	@Override
	public void getNextcall() {
		System.out.println("등급이 높은 고객의 전화를 우선적으로 상담원에게 연결합니다.");}

	@Override
	public void sendcallToAgent() {
		System.out.println("업무 스킬이 높은 상담원에게 우선적으로 전화를 연결합니다.\r\n");}
	
	
}

