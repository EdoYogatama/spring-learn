package com.yogatama.edo.springlearn.Game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements IGame{
	
	public void up() {
		System.out.println("Go Up");
	}
	
	public void down() {
		System.out.println("Go Down");
	}
	
	public void left() {
		System.out.println("Go Left");
	}
	
	public void right() {
		System.out.println("Go Right");
	}

}
