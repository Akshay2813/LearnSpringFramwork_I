package com.learnspring.framwork_app_05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.learnspring.framwork_app_05.game_05.GameRunner;
import com.learnspring.framwork_app_05.game_05.GamingConsoleInterfce;
import com.learnspring.framwork_app_05.game_05.MarioGame;
import com.learnspring.framwork_app_05.game_05.PacManGame;
import com.learnspring.framwork_app_05.game_05.SuperContraGame;

@Configuration
public class GaminConfiguration {
	
	@Bean
	public GamingConsoleInterfce game()
	{
		var game = new MarioGame();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsoleInterfce game)
	{
		return new GameRunner(game);
	}
}
