package Games;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	GamingConsole game;

	public GameRunner(@Qualifier("mario") GamingConsole game) {
		this.game = game;
	}

	public void run() {
		System.out.println("Runnig game " + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
