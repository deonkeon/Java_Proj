package inheritance_07.abstract_gamelevel;

public class PlayerEx {

	public static void main(String[] args) {

		Player player = new Player();		// 초보자 레벨
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();	// 중급자 레벨
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();	// 고급자 레벨
		player.upgradeLevel(sLevel);
		player.play(3);
	}

}
