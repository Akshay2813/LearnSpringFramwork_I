package com.learnspring.framwork_app_08;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.learnspring.framwork_app_08.game_08.GameRunner;

@Configuration
@ComponentScan("com.learnspring.framwork_app_08.game_08")
public class AppGamingSpringBean {

	static AnnotationConfigApplicationContext context;

	public static void main(String[] args) {
		try {
			context = new AnnotationConfigApplicationContext(AppGamingSpringBean.class);
			context.getBean(GameRunner.class).run();
		//We will make @Primary for Pacman Game so among three game,
		//Pacman game will run	as it has @Primary
		
			//@Qualifer refer package com.learnspring.framwork_app_09;



		} catch (Exception e) {

		} finally {
			context.close();
		}
	}
	
}