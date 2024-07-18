package com.learnspring.framwork_app_01;

import com.learnspring.framwork_app_01.game_01.GameRunner;
import com.learnspring.framwork_app_01.game_01.MarioGame;
import com.learnspring.framwork_app_01.game_01.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create GameRunner Class instance and run MarioGame

		MarioGame marioGame = new MarioGame();
		SuperContraGame superContraGame = new SuperContraGame();
		GameRunner gameRunner = new GameRunner(marioGame);
		
//		GameRunner gameRunner = new GameRunner(superContraGame);
		//we will get compile time error as GameRuuner class is tightly couple to MarioGame
		//To avoid we have to change GameRunner from MarioGame game to SuperContraGame game 
		// but again we failed to run MarioGame now so how we can avoid 
		//answer is loosely coupled Interface or Spring
		//See com.learnspring.framwork_app_02 package

		gameRunner.run();


	}

}
