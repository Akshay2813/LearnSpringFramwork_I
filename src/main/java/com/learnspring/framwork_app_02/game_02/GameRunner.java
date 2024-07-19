package com.learnspring.framwork_app_02.game_02;

public class GameRunner {
	
	GamingConsoleInterfce game;

	public GameRunner(GamingConsoleInterfce game)  // (SuperContraGame game)
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
