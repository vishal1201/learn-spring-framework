package in.pelligent.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole {

	public void up() {
		System.out.println("Go Up");
	}
	
	public void down() {
		System.out.println("Go Down");
	}
	
	public void left() {
		System.out.println("Go Left");
	}
	
	public void right() {
		System.out.println("Go Right");
	}
}
