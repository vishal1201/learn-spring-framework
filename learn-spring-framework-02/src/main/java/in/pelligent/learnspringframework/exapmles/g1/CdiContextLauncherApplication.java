package in.pelligent.learnspringframework.exapmles.g1;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Named
class BusinessService {
    DataService dataService;

    public DataService getDataService() {
        return dataService;
    }

    @Inject
    public void setDataService(DataService dataService) {
        System.out.println("Setter Injection");
        this.dataService = dataService;
    }
}

@Named
class DataService {

}

@Configuration
@ComponentScan
public class CdiContextLauncherApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(CdiContextLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean(BusinessService.class).getDataService());
        } catch (Exception e) {

        }
    }

}
