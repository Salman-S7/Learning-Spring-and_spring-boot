package com.learnSpringFramework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learnSpringFramework.game.GameRunner;

public class App03GamingSpringBeans {

	private static AnnotationConfigApplicationContext context;

	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
		context.getBean(GameRunner.class).run();

	}

}
