package com.yogatama.edo.springlearn.Runner;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.yogatama.edo.springlearn.Game.IGame;
import com.yogatama.edo.springlearn.Game.MarioGame;

@Component
public class GameRunner {
	
	private IGame game;
	
	public GameRunner(@Qualifier("SnakeQualifier") IGame game) {
		this.game = game;
	}
	
	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
	}
	
}
