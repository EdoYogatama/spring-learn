package com.yogatama.edo.springlearn.Runner;

import com.yogatama.edo.springlearn.Game.MarioGame;

public class GameRunner {
	
	private MarioGame game;
	
	public GameRunner(MarioGame game) {
		this.game = game;
	}
	
	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
	}
	
}
