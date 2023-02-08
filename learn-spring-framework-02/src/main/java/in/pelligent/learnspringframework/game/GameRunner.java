package in.pelligent.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private GamingConsole game;

    public GameRunner(@Qualifier("pacmanGame") GamingConsole game) {
        // TODO Auto-generated constructor stub
        this.game = game;
    }

    public void run() {
        System.out.println("Running game= " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
