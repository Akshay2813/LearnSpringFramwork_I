package com.learnspring.framwork_app_09.game_09;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class GameRunner {
	GamingConsoleInterfce game;
	public GameRunner(@Qualifier("SuperContraGameQualifer") GamingConsoleInterfce game)  
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