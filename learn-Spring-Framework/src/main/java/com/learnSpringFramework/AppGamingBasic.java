package com.learnSpringFramework;

import com.learnSpringFramework.game.GameRunner;
import com.learnSpringFramework.game.Pacmangame;

public class AppGamingBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// var game = new MarioGame();
		// var game = new SuperContra();
		var game = new Pacmangame();
		var gameRunner = new GameRunner(game);

		gameRunner.run();

	}

}
