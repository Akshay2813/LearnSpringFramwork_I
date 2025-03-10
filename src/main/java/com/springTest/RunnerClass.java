package com.springTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class RunnerClass extends ParentRunnerClass {

	@Override
	protected ApplicationContext getAnnotatedApplicationContext() {
		context= new AnnotationConfigApplicationContext(APIConfigApplication.class);
		System.out.println("I am in getAnnotatedApplicationContext method");
		return context;
	}
	
	public static void main(String[] args)
	{
		ApplicationContext context= new AnnotationConfigApplicationContext(APIConfigApplication.class);

	}
	
	
		

}