package com.learnspring.framwork_app_01.game_01;

public class GameRunner {
	MarioGame game;
//	SuperContraGame game;

	public GameRunner(MarioGame game)  // (SuperContraGame game)
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