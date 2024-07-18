package com.learnspring.framwork_app_04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Launch a Spring Context
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfigurationCls.class);
		
		// 2. Configure things that we want spring to manage @Configuration class
		
		//we ask context to get me name object as below
		//we are passing bean methodName
		System.out.println("Name Bean or object =  " + context.getBean("name"));
		
		System.out.println("Age Bean or object = " + context.getBean("age"));
		
		System.out.println("Person Bean or object = " + context.getBean("person")); 
//		System.out.println("Address Bean or object = " + context.getBean("address"));
		System.out.println("Address Bean or object by using Custom Name = " + context.getBean("CustomBeanNameAddress2"));
		System.out.println("Address Bean or object by using type = " + context.getBean(Address.class));
		
		System.out.println("Person Bean or object which uses existing bean i.e. autowired by methodCall = " + context.getBean("person2MethodCall"));

		System.out.println("Person Bean or object which uses existing bean i.e. autowired by Paramter = " + context.getBean("person3Paramter"));



		
		


		
		
		
		
		

	}

}
