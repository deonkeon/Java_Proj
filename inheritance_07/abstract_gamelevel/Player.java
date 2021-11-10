package inheritance_07.abstract_gamelevel;

public class Player {	// PlayerLevel : 데이타 타입, level : 인스턴스 변수
	private PlayerLevel level;
	
	public Player () {	//생성자
		level = new BeginnerLevel();	//객체 생성
		level.showLevelMessage();
	}
	public PlayerLevel getLevel() {
		return level;
	}
	public void upgradeLevel (PlayerLevel level) {	//업캐스팅
		this.level = level;
		level.showLevelMessage();
	}
	public void play(int count) {
		level.go(count);
	}
}
