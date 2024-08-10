package com.learnspring.framwork_app_12.learn.eager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
class ClassA{
	
	ClassA()
	{
		System.out.println("===============Some Intiliaztion Happened for Class A =========");

	}
}

@Component
class ClassB{
	private ClassA classA;
	
	@Autowired
	ClassB( ClassA classA)
	{
		this.classA=classA;
		System.out.println("===============Some Intiliaztion Happened for Class B==========");
	}
	
}



@Configuration
@ComponentScan
public class EagerIntilization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Some Intiliaztion Started");

		AnnotationConfigApplicationContext context= 
				new AnnotationConfigApplicationContext(EagerIntilization.class);
		
		System.out.println("Some Intiliaztion Ended");

		//Here we are not calling any Bean class or its method still Intiliaztion of Class happeend
		//We call it Eager Intilization
		

	}

}
