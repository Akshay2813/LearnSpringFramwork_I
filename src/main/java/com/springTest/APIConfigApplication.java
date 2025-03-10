package com.springTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.springTest"})
public class APIConfigApplication {

	@Bean
	public Propertiess propertiesBean()
	{
		return new Propertiess();
	}
	
	@Autowired
	public Enviornment env;

}
