package com.learnspring.framwork_app_04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//class Person
//{
//	private String name;
//	private String age;
//	public Person(String string, int i) {
//		this.name=name;
//		this.age=age;
//		// TODO Auto-generated constructor stub
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getAge() {
//		return age;
//	}
//	public void setAge(String age) {
//		this.age = age;
//	}
//
//}


record Person(String name,int age) {};

record Address(String firstLine, String city) {};



@Configuration
public class HelloWorldConfigurationCls {
	
	//is Configuration class
	//Here we can defines method to create Spring Beans 
	//creating name bean i.e. name object
	@Bean
	public String name()  //name is object which is managed by spring
	{
		return "Akshay";
	}
	
	@Bean
	public int age()
	{
		return 29;
	}
	
	@Bean
	public Person person()
	{
		return new Person("Amruta",27);
	}
	
//	@Bean
//	public Address address()
//	{
//		return new Address("Marwad Galli","Pune");
//	}
//	
	//Now Suppose for above address bean I need to call with another name like address2 i.e. customizedBeanName
	//then do as below
	@Bean(name="CustomBeanNameAddress2")
	public Address address()
	{
		return new Address("Marwad Galli","Pune");
	}
	
	// all above bean we created are Independent to each other
	// there  is no releation between them. 
	// what if we have create new bean but we have to use existing bean which have releation betweeen them 
	//there are 2 ways todo this
	
	//way 1 methodCall
	@Bean
	public Person person2MethodCall()
	{
		return new Person(name(), age());
	}
	
	//way 2 Parameter
	@Bean Person person3Paramter(String name, int age)  //name age are above bean
	{
		return new Person(name, age);
	}
	
	
	
	
	

	


}

