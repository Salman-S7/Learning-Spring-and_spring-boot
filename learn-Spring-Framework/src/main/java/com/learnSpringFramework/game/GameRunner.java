package com.learnSpringFramework.game;

public class GameRunner {
	private MarioGame marioGame;

	public GameRunner(MarioGame marioGame) {
		// TODO Auto-generated constructor stub
		this.marioGame = marioGame;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running game " + marioGame);
		marioGame.up();
		marioGame.down();
		marioGame.left();
		marioGame.right();

	}

}
