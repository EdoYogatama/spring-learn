package com.yogatama.edo.springlearn.Game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements IGame{

	public MarioGame() {
		
	}
	
	public void up() {
		System.out.println("Jump");
	}
	
	public void down() {
		System.out.println("Duck");
	}
	
	public void left() {
		System.out.println("Backward");
	}
	
	public void right() {
		System.out.println("Accelerate");
	}
}
