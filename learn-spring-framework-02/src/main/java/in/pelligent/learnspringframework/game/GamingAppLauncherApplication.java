package in.pelligent.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class GamingAppLauncherApplication {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
            GamingConsole game = context.getBean(GamingConsole.class);
            GameRunner gameRunner = context.getBean(GameRunner.class);
            gameRunner.run();
        } catch (Exception e) {

        }
    }

}
