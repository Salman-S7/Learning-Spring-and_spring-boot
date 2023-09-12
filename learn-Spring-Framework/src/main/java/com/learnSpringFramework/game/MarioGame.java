package com.learnSpringFramework.game;

public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Jump..");

	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Sit down..");

	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("go back..");

	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Accelerate..");
	}

}
