package com.learnSpringFramework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learnSpringFramework.game.GameRunner;
import com.learnSpringFramework.game.GamingConsole;
import com.learnSpringFramework.game.Pacmangame;

@Configuration
public class GamingConfiguration {
	@Bean
	public GamingConsole game() {
		return new Pacmangame();
	}

	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
}
