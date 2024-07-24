package com.learnspring.framwork_app_10;

import java.util.Arrays;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

class Animal
{
	Dog dog ; // here we are not creating object so value null
	Cat cat; // here we are not creating object so value null
	Dog dog1=  new Dog() ; // here we are  creating object so value will be com.learnspring.framwork_app_10.Dog@50b5ac82
	Cat cat1= new Cat (); // here we are  creating object so value will be com.learnspring.framwork_app_10.Cat@50b5ac82
	public String toString()
	{
		return "Using Animal Dog= " + dog + " and " + "Dog1 = " + dog1 + " and " + "cat=" + cat + " and "
				+ "cat1= " + cat1;
	}
}

class Dog {}
class Cat {}

@Component
class BuisnesClass{
	
	Dependency1 dependency1;  //here are not autowired yet into BuisnessClass sp value=null
	Dependency2 dependency2; //here are not autowired yet into BuisnessClass sp value=null
	
	
	public String toString()
	{
		return "Using Dependency " + dependency1 + " and " + dependency2;
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
			
//         	Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean(BuisnesClass.class));
			
			//we get Output as below:
			//Using Dependency null and null
			//to get object we have to @autowired tag to inject depdencny
			// Refer package com.learnspring.framwork_app_10.learn.fielddependencyinjection;
 

			// means these depenedcy is not autowired yet 
			Animal animal = new Animal();
			System.out.println(animal);
		
		}
		
		
		

	}

}
