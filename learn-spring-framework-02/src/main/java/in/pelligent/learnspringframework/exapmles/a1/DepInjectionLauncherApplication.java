package in.pelligent.learnspringframework.exapmles.a1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class YourBusinessClass {
    //	@Autowired
    Dependency1 dependency1;

    //	@Autowired Field DI
    Dependency2 dependency2;

    //	@Autowired - No need, it is implicit.
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        super();
        System.out.println("Constructor Injection");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    public Dependency1 getDependency1() {
        return dependency1;
    }

    //	@Autowired Setter DI
    public void setDependency1(Dependency1 dependency1) {
        System.out.println("dependency1: " + dependency1);
        this.dependency1 = dependency1;
    }

    public Dependency2 getDependency2() {
        return dependency2;
    }

    //	@Autowired
    public void setDependency2(Dependency2 dependency2) {
        System.out.println("dependency2: " + dependency2);
        this.dependency2 = dependency2;
    }

    public String toString() {
        return String.format("dependency1: %s | dependency2: %s", dependency1, dependency2);
    }
}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            var businessClass = context.getBean(YourBusinessClass.class);
            System.out.println(businessClass);
        } catch (Exception e) {

        }
    }

}
