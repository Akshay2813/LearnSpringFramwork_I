package com.learnspring.framwork_app_04;

import java.util.Arrays;

import org.springframework.beans.factory.config.BeanDefinition;
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

		
		//get all Beans Names
		String[] allBeanNames = context.getBeanDefinitionNames();
		for(int i =0; i<allBeanNames.length; i++) {
			System.out.println(allBeanNames[i]);
		}
		
		//get  beans count
		int allBeanCount = context.getBeanDefinitionCount();
		System.out.println("allBeanCount is = " + allBeanCount);
		
		//get specific Bean
		BeanDefinition nameBean = context.getBeanDefinition("name");
		System.out.println("nameBean Defintion is = " + nameBean);
		
		
		//what happend suppose we have multiple matching bean how we give priority
		//Exception in thread "main" org.springframework.beans.factory.NoUniqueBeanDefinitionException: 
		//No qualifying bean of type 'com.learnspring.framwork_app_04.Address' available: expected 
		//single matching bean but found 3: CustomBeanNameAddress2,address1,address2

		//way 1 : use @Primary for one bean
		System.out.println("Primary Bean tag get priority in case of multiple matching bean " + context.getBean(Address.class));


		//way 2 while autowiring into another bean user @Qualifier
		System.out.println(" Qualifier Bean tag get priority in case of multiple matching bean passed into another bean" + context.getBean("person3Qualifier"));
		

		
		


		
		
		
		
		

	}

}
