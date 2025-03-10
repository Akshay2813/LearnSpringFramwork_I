package com.springTest;

import org.springframework.context.ApplicationContext;

public abstract class ParentRunnerClass {
	private ApplicationContext applicationContext;
	protected ApplicationContext context= this.getContextInstance();

	protected ApplicationContext getContextInstance() {
		
		System.out.println("I am in getContextInstance method");
			if(this.applicationContext==null)
			{
				this.applicationContext=this.getAnnotatedApplicationContext();
			}
			
			return this.applicationContext;
	}
	
	abstract ApplicationContext getAnnotatedApplicationContext();
}
