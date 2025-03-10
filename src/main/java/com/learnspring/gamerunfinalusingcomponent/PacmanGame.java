package com.learnspring.gamerunfinalusingcomponent;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GameConsoleInterface {


	public void up() {
		System.out.println("Pacman UP");
		
	}

	public void down() {
		
		System.out.println("Pacman Down");
	}

	
	public void left() {
		
		System.out.println("Pacman LEFT");
	}


	public void right() {
		
		System.out.println("Pacman RIGHT");
	}

}
