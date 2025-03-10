package com.learnspring.game.dpenedencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class BuisnessClass
{

	NormalClassDependency normalClassDependency = new NormalClassDependency();
	
	//=====================
	@Autowired
	FieldClassDependency fieldClassDependency;
	
	//======================================
	SetterClassDependency setterClassDependency;
	
	@Autowired
	public void setSetterClassDependency(SetterClassDependency setterClassDependency) {
		this.setterClassDependency=setterClassDependency;
	}
	
	//=====================================================
	ConstructorClassDependency constructorClassDependency;
	
	@Autowired
	BuisnessClass(ConstructorClassDependency constructorClassDependency)
	{
		this.constructorClassDependency = constructorClassDependency;
	}
	
	public String toString()
	{
		return "using " + normalClassDependency+"---" + fieldClassDependency + 
				"---" + setterClassDependency +"---"  + constructorClassDependency;
	}
	

}
@Component
class NormalClassDependency{}


@Component
class FieldClassDependency{}

@Component
class SetterClassDependency{}

@Component
class ConstructorClassDependency{}

@Configuration
@ComponentScan
public class ABCD {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext	context =
				new AnnotationConfigApplicationContext(ABCD.class);
		System.out.println("==Printing all Bean in current pakcage===");
		for(int i=0; i< context.getBeanDefinitionNames().length;i++)
		{
			System.out.println(context.getBeanDefinitionNames()[i]);
		}
		System.out.println("==DONE===");
		System.out.println("====================");
		System.out.println("print Buisness class bean");
		
		System.out.println(context.getBean(BuisnessClass.class));
		
		//If we do not use toString method in Buisness class we will get output as below:
		//com.learnspring.game.dpenedencyinjection.BuisnessClass@53ce1329
		
		//If we use toString method then we got output as we defined in method
		//For eg:
		//using com.learnspring.game.dpenedencyinjection.NormalClassDependency@53ce1329---com.learnspring.game.dpenedencyinjection.FieldClassDependency@316bcf94---com.learnspring.game.dpenedencyinjection.SetterClassDependency@6404f418---com.learnspring.game.dpenedencyinjection.ConstructorClassDependency@3e11f9e9

	}

}
