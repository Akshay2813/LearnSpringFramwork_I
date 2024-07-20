package com.learnspring.framwork_app_07;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.learnspring.framwork_app_07.game_07.GameRunner;
import com.learnspring.framwork_app_07.game_07.GamingConsoleInterfce;

@Configuration
@ComponentScan("com.learnspring.framwork_app_07.game_07")
public class AppGamingSpringBean {

	static AnnotationConfigApplicationContext context;

	public static void main(String[] args) {
		try {
			context = new AnnotationConfigApplicationContext(AppGamingSpringBean.class);
			context.getBean(GameRunner.class).run();
			//Here we only make @Component for MarioGame and GameRunner class
			//@Component means Such classes are considered as candidates for auto-detectionwhen
			//using annotation-based configuration and classpath scanning.
			//In GameRunner class we have GamingConsoleInterfce game passing as constrcutor args
			//so it is searching game object which have @Component
			// here it is for MarioGame
			//What if we have @Component is for SuperContraGame and PacmanGame which implement GamingConsoleInterfce
			// for this we @Primary @Qualifier
			//Refer package com.learnspring.framwork_app_08;


		} catch (Exception e) {

		} finally {
			context.close();
		}
	}
	
}