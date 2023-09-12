package com.learnSpringFramework;

import com.learnSpringFramework.game.GameRunner;
import com.learnSpringFramework.game.MarioGame;

public class AppGamingBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);

		gameRunner.run();

	}

}
