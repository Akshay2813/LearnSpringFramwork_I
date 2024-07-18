package com.learnspring.framwork_app_03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App01HelloWorldJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Launch a Spring Context
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfigurationCls.class);
		
		// 2. Configure things that we want spring to manage @Configuration class
		
		//we ask context to get me name object as below
		
		System.out.println(context.getBean("name"));
		Object myName = context.getBean("name");
		System.out.println(myName);
		
		
		
		

	}

}
