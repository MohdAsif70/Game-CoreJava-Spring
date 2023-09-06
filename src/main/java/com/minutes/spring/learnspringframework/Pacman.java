package com.minutes.spring.learnspringframework;

import com.minutes.spring.learnspringframework.game.GameConsole;

public class Pacman implements GameConsole {
	
	public void right() {
		System.out.println("Pac right");
}

	public void left() {
		System.out.println("Pac left");
	}

	public void down() {
		System.out.println("Pac down");
	}

	public void up() {
		System.out.println("Pac UP");
	}
	

}
