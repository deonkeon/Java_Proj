package interface_08.lab01;

public class SmartPhone extends PDA implements MobilePhoneinterface, MP3interface{
	// SmartPhone 클래스는 PDA 클래스를 상속받고 있고, 모바일폰과 MP3 인터페이스를 구현
	// 다중상속을 허용하지 않는다. (자식은 하나의 부모 클래스만 가진다.)
	// 인터페이스는 다중 구현이 가능
	
	@Override
	public void sendcall() { //Phone1에서 선언해놓은 메소드 (상속)
		System.out.println("전화를 겁니다.");} 

	@Override
	public void receivecall() { //Phone1에서 선언해놓은 메소드 (상속)
		System.out.println("전화를 받습니다.");} 
	

	@Override
	public void play() { //MP3에서 선언
		System.out.println("음악을 재생합니다.");} 
	

	@Override
	public void stop() { //MP3에서 선언
		System.out.println("음악 재생을 멈춥니다.");} 

	@Override
	public void sendSMS() { //MobilePhone에서 선언
		System.out.println("문자를 보냅니다.");} 

	@Override
	public void receiveSMS() { //MobilePhone에서 선언
		System.out.println("문자가 왔습니다.");} 
	
	public void schedule() {System.out.println("달력을 실행합니다.");}	//추가 작성 메소드
	
}///////class

