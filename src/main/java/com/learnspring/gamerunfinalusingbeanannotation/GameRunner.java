package com.learnspring.gamerunfinalusingbeanannotation;


import com.learnspring.framwork_app_09.game_09.GamingConsoleInterfce;

public class GameRunner {
	GameConsoleInterface game;
	public GameRunner( GameConsoleInterface game)  
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
