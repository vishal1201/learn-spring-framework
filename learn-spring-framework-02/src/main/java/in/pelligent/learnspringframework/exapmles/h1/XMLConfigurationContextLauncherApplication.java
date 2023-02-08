package in.pelligent.learnspringframework.exapmles.h1;

import in.pelligent.learnspringframework.game.GameRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLConfigurationContextLauncherApplication {

    public static void main(String[] args) {
        try (var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
//			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
//			System.out.println(context.getBean("name"));
//			System.out.println(context.getBean("age"));
            context.getBean(GameRunner.class).run();
        } catch (Exception e) {

        }
    }

}
