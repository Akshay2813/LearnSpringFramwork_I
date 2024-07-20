package com.learnspring.framwork_app_08.game_08;

import org.springframework.stereotype.Component;
@Component
public class GameRunner {
	GamingConsoleInterfce game;
	public GameRunner(GamingConsoleInterfce game)  
	{
		this.game=game;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running Game: " + game.toString());
		game.up();
		game.down();
		game.right();
		game.left();
	}
}