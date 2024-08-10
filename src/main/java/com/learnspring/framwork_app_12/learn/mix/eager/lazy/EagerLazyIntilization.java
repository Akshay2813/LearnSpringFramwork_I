package com.learnspring.framwork_app_12.learn.mix.eager.lazy;

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
		System.out.println("===============Some Intiliaztion Happened for Class A Before  Intiliaztion Ended as it Eager  and we are NOT explictly calling=========");

	}
}

@Component
@Lazy
class ClassB{
	private ClassA classA;
	
	
	ClassB()
	{
		
		System.out.println("===============Some Intiliaztion Happened for Class B After  Intiliaztion Ended as it Lazy =========");
	}
	
}



@Configuration
@ComponentScan
public class EagerLazyIntilization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Some Intiliaztion Started");

		AnnotationConfigApplicationContext context= 
				new AnnotationConfigApplicationContext(EagerLazyIntilization.class);
		
		System.out.println("Some Intiliaztion Ended");

		context.getBean(ClassB.class);


	}

}
