package in.pelligent.learnspringframework.businesscalculation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class BusinessCalculationApplication {

    public static void main(String[] args) {
        try (
                var context = new AnnotationConfigApplicationContext(BusinessCalculationApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            var businessCalcSrv = context.getBean(BusinessCalculationService.class);

            int max = businessCalcSrv.findMax();
            System.out.println("max: " + max);
        }
    }

}
