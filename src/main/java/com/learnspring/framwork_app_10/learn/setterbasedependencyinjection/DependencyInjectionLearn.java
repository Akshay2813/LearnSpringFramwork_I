package com.learnspring.framwork_app_10.learn.setterbasedependencyinjection;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;





@Component
class BuisnesClass{
	

	Dependency1 dependency1;  
	
	Dependency2 dependency2; 
	
	@Autowired //here are  autowired  so we get object this is Setter Injection
	public void setDependency1(Dependency1 dependency1) {
		this.dependency1 = dependency1;
	}

	@Autowired //here are  autowired  so we get object this is Setter Injection
	public void setDependency2(Dependency2 dependency2) {
		this.dependency2 = dependency2;
	}
	
	
	public String toString()
	{
		return "Using Dependency " + dependency1 + " and " + dependency2;
		//Using Dependency com.learnspring.framwork_app_10.learn.setterbasedependencyinjection.Dependency1@bae7dc0 and com.learnspring.framwork_app_10.learn.setterbasedependencyinjection.Dependency2@209da20d

	}
	
}


@Component
class Dependency1 {}


@Component
class Dependency2 {}


@Configuration
@ComponentScan  //If packageName is not mentioned then ByDefault it will scan current package
public class DependencyInjectionLearn {

	public static void main(String[] args) {
		//try with resources block
		try (AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DependencyInjectionLearn.class))
		{
			//We have Different types of Dependency Injection
			//1. Constructor Based: Dependencies are set by creating bean using it's constructor
			//2. Setter Based : Dependencies are set by calling setter method on your bean
			//3. Field Based : No setter or constructor. Dependencies is injected using reflection.
			
			//print all bean
			
//			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean(BuisnesClass.class));
			
			

			
		
		}
		
		
		

	}

}
