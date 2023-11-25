package com.yogatama.edo.springlearn.Main;

import com.yogatama.edo.springlearn.Game.MarioGame;
import com.yogatama.edo.springlearn.Runner.GameRunner;

public class AppMain {

	public static void main(String[] args) {
		MarioGame game = new MarioGame();
		GameRunner runner = new GameRunner(game);
		
		System.out.println(game.toString());
		runner.run();
	}

}
