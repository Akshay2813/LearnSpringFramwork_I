package com.learnspring.framwork_app_06;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learnspring.framwork_app_05.game_05.GameRunner;
import com.learnspring.framwork_app_05.game_05.GamingConsoleInterfce;
import com.learnspring.framwork_app_05.game_05.MarioGame;

@Configuration
public class AppGamingSpringBean {
	static AnnotationConfigApplicationContext context;
	
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
	
	//Here we are deleting @Configuration class i.e. GaminConfiguration class 
	// and making AppGamingSpringBean class itself as @Cofiguration class
	// but here also we are creating Bean but what if spring creating bean for us
	//Refer package com.learnspring.framwork_app_07
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		context = new AnnotationConfigApplicationContext(AppGamingSpringBean.class);
//		context.getBean(GamingConsoleInterfce.class).up();	
		context.getBean(GameRunner.class).run();

		}
		catch(Exception e)
		{
			
		}
		finally
		{
			context.close();
		}
		

}
}