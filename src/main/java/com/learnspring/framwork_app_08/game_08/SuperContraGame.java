package com.learnspring.framwork_app_08.game_08;
import org.springframework.stereotype.Component;

@Component
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
