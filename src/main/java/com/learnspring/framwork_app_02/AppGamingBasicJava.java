package com.learnspring.framwork_app_02;

import com.learnspring.framwork_app_02.game_02.GameRunner;
import com.learnspring.framwork_app_02.game_02.MarioGame;
import com.learnspring.framwork_app_02.game_02.PacManGame;
import com.learnspring.framwork_app_02.game_02.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// here we can run any game as GamerRunner class is loosely couple to MarioGame class and SuperContraGame class
		// as we connected via GamingConsoleInterfce Interface 

//		MarioGame game = new MarioGame();
//		SuperContraGame game = new (SuperContraGame);
		PacManGame game = new PacManGame();   // Object Creation
		GameRunner gameRunner = new GameRunner(game); //Object Creation + wiring of dependecies i.e.game
		//here game is dependency of GamerRunner class
		
		//Here we are creating objects, Managing Objects manually
		//how about to create and manage thses object by Spring framework
		//package com.learnspring.framwork_app_03;

		
		
		
	
		

		gameRunner.run();


	}

}
