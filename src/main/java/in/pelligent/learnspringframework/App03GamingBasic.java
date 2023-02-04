package in.pelligent.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.pelligent.learnspringframework.game.GameRunner;
import in.pelligent.learnspringframework.game.GamingConsole;
import in.pelligent.learnspringframework.game.MarioGame;
import in.pelligent.learnspringframework.game.PacmanGame;
import in.pelligent.learnspringframework.game.SuperContraGame;

public class App03GamingBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		var game = new MarioGame();
//		var game = new SuperContraGame();
//		var game = new PacmanGame();
//		var gameRunner = new GameRunner(game);
//		gameRunner.run();
		
		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			GamingConsole game = context.getBean(GamingConsole.class);
			GameRunner gameRunner = context.getBean(GameRunner.class);
			gameRunner.run();
		} catch (Exception e) {
			
		}
	}

}
