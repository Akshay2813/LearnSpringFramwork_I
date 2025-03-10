package com.springTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Enviornment {
	
	
	@Autowired
	public SubEnviornment SubEnv;

	Enviornment()
	{
		System.out.println("I am in Enviornment Constructor");

	}
}
