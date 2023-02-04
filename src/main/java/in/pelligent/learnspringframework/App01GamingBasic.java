package in.pelligent.learnspringframework;

import in.pelligent.learnspringframework.game.GameRunner;
import in.pelligent.learnspringframework.game.MarioGame;
import in.pelligent.learnspringframework.game.PacmanGame;
import in.pelligent.learnspringframework.game.SuperContraGame;

public class App01GamingBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacmanGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
