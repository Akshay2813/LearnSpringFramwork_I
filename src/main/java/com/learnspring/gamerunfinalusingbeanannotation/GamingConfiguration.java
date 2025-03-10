package com.learnspring.gamerunfinalusingbeanannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

	@Bean
	public GameConsoleInterface game()
	{
		GameConsoleInterface game= new PacmanGame();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner()
	{
		GameRunner gameRunner= new GameRunner(game());
		//Here game() method from line 10 autowired using method call
		return gameRunner;
	}
	
//	@Bean
//	public GameRunner gameRunner(GameConsoleInterface game)
//	{
//		GameRunner gameRunner= new GameRunner(game);
//		//Here game() method from line 10 autowired using paramtere
//		return gameRunner;
//	}
	

}
