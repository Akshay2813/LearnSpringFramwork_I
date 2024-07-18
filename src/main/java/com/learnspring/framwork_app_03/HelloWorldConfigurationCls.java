package com.learnspring.framwork_app_03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



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
	
	//lets create more bean like age, address etc in package com.learnspring.framwork_app_04;

	

	


}

