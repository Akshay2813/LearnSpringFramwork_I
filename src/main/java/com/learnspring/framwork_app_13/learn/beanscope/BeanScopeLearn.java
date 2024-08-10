package com.learnspring.framwork_app_13.learn.beanscope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class DefaultScope{}

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
class SingletonScope
{
}

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class PrototypeScope
{
}


@Configuration
@ComponentScan
public class BeanScopeLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context= 
				new AnnotationConfigApplicationContext(BeanScopeLearn.class);
		
		
		System.out.println("DefaultScope call first time hasvalue is   = " + context.getBean(DefaultScope.class) );
		System.out.println("DefaultScope call second time hasvalue is  = " + context.getBean(DefaultScope.class) );
		System.out.println("DefaultScope call third time hasvalue is   = " + context.getBean(DefaultScope.class) );
		System.out.println("DefaultScope call fourth time hasvalue is  = " + context.getBean(DefaultScope.class) );
		System.out.println("DefaultScope call fifth time hasvalue is   = " + context.getBean(DefaultScope.class) );

		System.out.println("=====================================");

		
		System.out.println("SingletonScope call first time hasvalue is  = " + context.getBean(SingletonScope.class) );
		System.out.println("SingletonScope call second time hasvalue is = " + context.getBean(SingletonScope.class) );
		System.out.println("SingletonScope call third time hasvalue is  = " + context.getBean(SingletonScope.class) );
		System.out.println("SingletonScope call fourth time hasvalue is = " + context.getBean(SingletonScope.class) );
		System.out.println("SingletonScope call fifth time hasvalue is  = " + context.getBean(SingletonScope.class) );

		System.out.println("=====================================");
		
		System.out.println("ProtoType call first time hasvalue is  = " + context.getBean(PrototypeScope.class) );
		System.out.println("ProtoType call second time hasvalue is = " + context.getBean(PrototypeScope.class) );
		System.out.println("ProtoType call third time hasvalue is  = " + context.getBean(PrototypeScope.class) );
		System.out.println("ProtoType call fourth time hasvalue is = " + context.getBean(PrototypeScope.class) );
		System.out.println("ProtoType call fifth time hasvalue is = " + context.getBean(PrototypeScope.class) );

		System.out.println("=====================================");

		System.out.println("DefaultScope is SingleTone Scope and it creates Single Instance per Spring IOC container ");
		System.out.println("ProtoType Scope  creates seperate Instance per Spring IOC container ");


	}

}
