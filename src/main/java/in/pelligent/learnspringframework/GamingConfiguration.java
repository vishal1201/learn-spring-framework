package in.pelligent.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.pelligent.learnspringframework.game.GameRunner;
import in.pelligent.learnspringframework.game.GamingConsole;
import in.pelligent.learnspringframework.game.PacmanGame;

@Configuration
public class GamingConfiguration {
	@Bean
	public GamingConsole game() {
		return new PacmanGame();
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		return new GameRunner(game);
	}
}
