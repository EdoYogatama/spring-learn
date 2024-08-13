package com.yogatama.edo.springlearn.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.yogatama.edo.springlearn.Game.IGame;
import com.yogatama.edo.springlearn.Game.PacmanGame;
import com.yogatama.edo.springlearn.Runner.GameRunner;

@Configuration
public class GamingConfiguration {
	@Bean
	public IGame game() {
		return new PacmanGame();
	}
	
	@Bean
	public GameRunner runner(IGame game) {
		return new GameRunner(game);
	}
}
