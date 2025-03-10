package com.learnspring.framwork_app_14.learn.postconstruct.predestory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass
{
	private SomeDependencyClass sd;
	
	@Autowired
	public SomeClass(SomeDependencyClass Sd)
	{
		this.sd=sd;
		System.out.println("All Dependecy are ready");
	}
	
	@PostConstruct
	public void initiliaze()
	{
		System.out.println("this method is PostConstruct and should be exeucted after all dependency are ready");
	}
	
	@PreDestroy
	public void clean()
	{
		System.out.println("this method is PreDestroy and should be exeucted Before all dependency destroyed");

	}
	
}

@Component
class SomeDependencyClass
{
	
}



@Configuration
@ComponentScan
public class LearnPostConstruct_PreDestroy {
	static AnnotationConfigApplicationContext context;

	public static void main(String[] args) {
		try {
		context = new AnnotationConfigApplicationContext(LearnPostConstruct_PreDestroy.class);
		}
		catch(Exception e) {
			
		}
		finally {
			System.out.println("Closing context");
			context.close(); 
			//Why I write finally block here
//			The @PreDestroy method in Spring is designed to be called when the Spring
//			application context is closing, but in your case, 
//			it's not being called because the context is not being closed explicitly.
			System.out.println("finally context is Closed ");

			}
		

	}

}
