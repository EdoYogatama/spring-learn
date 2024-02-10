package com.yogatama.edo.springlearn.Runner;

import com.yogatama.edo.springlearn.Game.IGame;
import com.yogatama.edo.springlearn.Game.MarioGame;

public class GameRunner {
	
	private IGame game;
	
	public GameRunner(IGame game) {
		this.game = game;
	}
	
	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
	}
	
}
