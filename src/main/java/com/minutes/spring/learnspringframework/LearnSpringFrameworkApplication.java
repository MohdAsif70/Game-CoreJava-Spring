package com.minutes.spring.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.minutes.spring.learnspringframework.game.GameRunner;
import com.minutes.spring.learnspringframework.game.MarioGame;
import com.minutes.spring.learnspringframework.game.GameConsole;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
//		MarioGame game = new MarioGame();
//		SuperContraGame game = new SuperContraGame();
		GameConsole game = new Pacman();    ///Just change the game name and it will run.Eg: MarioGame
		GameRunner runner = new GameRunner(game);
		runner.run();
	}

}
