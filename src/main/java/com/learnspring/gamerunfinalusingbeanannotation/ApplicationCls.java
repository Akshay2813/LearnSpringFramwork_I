package com.learnspring.gamerunfinalusingbeanannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learnspring.framwork_app_09.AppGamingSpringBean;

public class ApplicationCls {

	public static void main(String[] args) {

//Launch Spring context which is ocnfugration class
		
		AnnotationConfigApplicationContext	context =
				new AnnotationConfigApplicationContext(GamingConfiguration.class);
		
		System.out.println (context.getBean("game")); //calling by name
		
		//OR
		System.out.println (context.getBean(GameConsoleInterface.class)); //calling by type
		
		//Run Game
	
		context.getBean(GameRunner.class).run();; //by type .class

	}

}
