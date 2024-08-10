package com.learnspring.framwork_app_11;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class RealWorldSpringContextLauncherApplication {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(RealWorldSpringContextLauncherApplication.class);
		
		int maxNum = context.getBean(BuisnessCalculationService.class).findMax();
		System.out.println("maxNum in " + context.getBean(DataService.class).toString() + " = "+maxNum);
	

	}

}
