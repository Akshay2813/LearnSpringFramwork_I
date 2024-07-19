package com.learnspring.framwork_app_07;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.learnspring.framwork_app_07.game_07.GameRunner;

@Configuration
@ComponentScan("com.learnspring.framwork_app_07.game_07")
public class AppGamingSpringBean {

	static AnnotationConfigApplicationContext context;

	public static void main(String[] args) {
		try {
			context = new AnnotationConfigApplicationContext(AppGamingSpringBean.class);
			context.getBean(GameRunner.class).run();

		} catch (Exception e) {

		} finally {
			context.close();
		}
	}
}