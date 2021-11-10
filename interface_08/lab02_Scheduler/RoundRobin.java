package interface_08.lab02_Scheduler;

public class RoundRobin implements Scheduler{
	//상담원 한명씩 돌아가며 동일하게 상담업무 배분

	@Override
	public void getNextcall() {
		System.out.println("상담전화를 순서대로 대기열에서 가져옵니다.");}

	@Override
	public void sendcallToAgent() {
		System.out.println("다음 순서 상담원에게 배분합니다.\r\n");}
	
	
}

