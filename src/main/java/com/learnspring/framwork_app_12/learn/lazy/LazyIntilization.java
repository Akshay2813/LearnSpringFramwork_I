package com.learnspring.framwork_app_12.learn.lazy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
@Lazy
class ClassC{
	
	ClassC()
	{
		System.out.println("==========Some Intiliaztion Happened for Class C ==========");

	}
}

@Component
@Lazy
class ClassD{
	
	ClassD()
	{
		System.out.println("==========Some Intiliaztion Happened for Class D ==========");

	}
	
		
}



@Configuration
@ComponentScan
public class LazyIntilization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Some Intiliaztion Started");

		AnnotationConfigApplicationContext context= 
				new AnnotationConfigApplicationContext(LazyIntilization.class);
		
		System.out.println("Some Intiliaztion Ended");

		//till here Here we are not calling any Bean class or its method and Intiliaztion of Class happeend
		//as we use @Lazy Annotation 
		
		//now we explictyl calling Bean
		context.getBean(ClassC.class);
		
		

	}

}
