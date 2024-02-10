package com.yogatama.edo.springlearn.Game;

public class SnakeGame implements IGame{

	private boolean isTurned = false;
	
	public void up() {
		if(isTurned) {
			System.out.println("Go Up");
			isTurned = false;
		} else {
			System.out.println("Not Move");
		}
	}
	
	public void down() {
		if(isTurned) {
			System.out.println("Go Down");
			isTurned = false;
		} else {
			System.out.println("Not Move");
		}
	}
	
	public void left() {
		System.out.println("Turn Left");
		isTurned = true;
	}
	
	public void right() {
		System.out.println("Turn Right");
		isTurned = true;
	}
}
