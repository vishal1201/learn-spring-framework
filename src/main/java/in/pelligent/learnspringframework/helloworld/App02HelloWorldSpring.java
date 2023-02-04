package in.pelligent.learnspringframework.helloworld;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			var name = context.getBean("name");
			var age = context.getBean("age");
			var person = context.getBean("person");
			var vishal = context.getBean("vishal");
			var personWithAddress = context.getBean("personWithAddress");
			var address = context.getBean("address");
			
			System.out.println(name);
			System.out.println(age);
			System.out.println(person);
			System.out.println(vishal);
			System.out.println(personWithAddress);
			System.out.println(address);
			System.out.println(context.getBean(Address.class));
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
