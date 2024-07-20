package com.learnspring.framwork_app_09.game_09;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsoleInterfce {
	
	public void up()
	{
		System.out.println("Mario UP");
	}
	public void down()
	{
		System.out.println("Mario DOWN");
	}
	public void left()
	{
		System.out.println("Mario LEFT");

	}
	public void right()
	{
		System.out.println("Mario RIGHT");

	}

}
