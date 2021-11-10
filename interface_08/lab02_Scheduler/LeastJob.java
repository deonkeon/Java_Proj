package interface_08.lab02_Scheduler;

public class LeastJob implements Scheduler{
	//현재 상담업무가 없거나 상담 대기가 가장 작은 상담원에게 전화 넘기기

	@Override
	public void getNextcall() {
		System.out.println("상담전화를 순서대로 대기열에서 가져옵니다.");}

	@Override
	public void sendcallToAgent() {
		System.out.println("현재 상담업무가 없거나 상담대기가 적은 상담원에게 전화를 연결합니다.\r\n");} 
	
}

