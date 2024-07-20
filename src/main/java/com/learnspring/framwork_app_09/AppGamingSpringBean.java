package com.learnspring.framwork_app_09;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.learnspring.framwork_app_09.game_09.GameRunner;
import com.learnspring.framwork_app_09.game_09.GamingConsoleInterfce;

@Configuration
@ComponentScan("com.learnspring.framwork_app_09.game_09")
public class AppGamingSpringBean {

	static AnnotationConfigApplicationContext context;
 
	public static void main(String[] args) {
		try {
			context = new AnnotationConfigApplicationContext(AppGamingSpringBean.class);
			context.getBean(GameRunner.class).run();
			// We will make @Qualifer for SuperContraGame @Primary for Pacmane but
			// in GameRunner we are passiing @Qualifer SuperCOntraGameQualifer in agr
			// Game so among three game,
			// SuperContraGame will game will run as it has @Qualifier("SuperContraGameQualifer")
			// GameRunner class have autowired by @Qualifier("SuperContraGameQualifer")
			// instead of GamingConsoleInterfce game only

		} catch (Exception e) {

		} finally {
			context.close();
		}
	}

}