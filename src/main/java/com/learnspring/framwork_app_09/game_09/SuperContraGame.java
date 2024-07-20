package com.learnspring.framwork_app_09.game_09;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifer")
public class SuperContraGame implements GamingConsoleInterfce{
	
	public void up()
	{
		System.out.println("UP Contra");
	}
	public void down()
	{
		System.out.println("DOWN Contra");
	}
	public void left()
	{
		System.out.println("LEFT Contra");

	}
	public void right()
	{
		System.out.println("RIGHT Contra");

	}

}
