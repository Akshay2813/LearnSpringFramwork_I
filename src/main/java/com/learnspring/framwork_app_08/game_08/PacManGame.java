package com.learnspring.framwork_app_08.game_08;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacManGame implements GamingConsoleInterfce{
	public void up()
	{
		System.out.println("UP Pacman");
	}
	public void down()
	{
		System.out.println("DOWN Pacman");
	}
	public void left()
	{
		System.out.println("LEFT Pacman");

	}
	public void right()
	{
		System.out.println("RIGHT Pacman");

	}

}
