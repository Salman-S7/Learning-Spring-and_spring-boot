package Games;

public class BasicGameRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var game = new SuperContraGame();

		new GameRunner(game).run();
	}

}
