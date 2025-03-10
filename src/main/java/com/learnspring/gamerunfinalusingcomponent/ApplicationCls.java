package com.learnspring.gamerunfinalusingcomponent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.learnspring.gamerunfinalusingcomponent")
public class ApplicationCls {
	
	
	// INSTEAD OF BELOW CODE WRITE @Compnent ANNOTATION ON PACMAN GAME
//	@Bean
//	public GameConsoleInterface game()
//	{
//		GameConsoleInterface game= new PacmanGame();
//		return game;
//	}
	
	
	//FOR BELOW ALSO USE COMPONENT 
	
//	@Bean
//	public GameRunner gameRunner(GameConsoleInterface game)
//	{
//		GameRunner gameRunner= new GameRunner(game); 
//		return gameRunner;
//	}

	public static void main(String[] args) {

//Launch Spring context which is ocnfugration class
		
		AnnotationConfigApplicationContext	context =
				new AnnotationConfigApplicationContext(ApplicationCls.class);
	
		System.out.println (context.getBean(GameConsoleInterface.class)); //calling by type
		
		//Run Game
	
		context.getBean(GameRunner.class).run();; //by type .class

	}

}
