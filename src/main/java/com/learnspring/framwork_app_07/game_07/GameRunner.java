package com.learnspring.framwork_app_07.game_07;

import org.springframework.stereotype.Component;
@Component
public class GameRunner {
	GamingConsoleInterfce game;
//	SuperContraGame game;

	public GameRunner(GamingConsoleInterfce game)  // (SuperContraGame game)
	{
		this.game=game;
	}
	
	// Here MarioGame is Tightly Coupled to GameRunner Class
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running Game: " + game.toString());
		game.up();
		game.down();
		game.right();
		game.left();
	}
}