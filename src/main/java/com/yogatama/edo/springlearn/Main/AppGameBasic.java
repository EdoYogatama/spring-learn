package com.yogatama.edo.springlearn.Main;

import com.yogatama.edo.springlearn.Game.IGame;
import com.yogatama.edo.springlearn.Game.MarioGame;
import com.yogatama.edo.springlearn.Runner.GameRunner;

public class AppGameBasic {

	public static void main(String[] args) {
		IGame game = new MarioGame();
		GameRunner runner = new GameRunner(game);
		
		System.out.println(game.toString());
		runner.run();
	}

}
