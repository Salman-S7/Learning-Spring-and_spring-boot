package com.learnSpringFramework.game;

public class Pacmangame implements GamingConsole {

	@Override
	public void left() {
		System.out.println("move left");
	}

	@Override
	public void right() {
		System.out.println("move right");

	}

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("move up");

	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("move down");

	}

}
