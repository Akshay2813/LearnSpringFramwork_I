package com.learnspring.framwork_app_05;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learnspring.framwork_app_05.game_05.GameRunner;
import com.learnspring.framwork_app_05.game_05.GamingConsoleInterfce;

public class AppGamingSpringBean {
	static AnnotationConfigApplicationContext context;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		context = new AnnotationConfigApplicationContext(GaminConfiguration.class);
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