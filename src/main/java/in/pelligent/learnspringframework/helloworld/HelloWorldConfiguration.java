package in.pelligent.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {};
record Address(String firstLine, String city) {};

public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Vishal";
	}
	
	@Bean
	public int age() {
		return 28;
	}
	
	@Bean
	public Person person() {
		return new Person("Sherlock Holmes", 38, address());
	}
	
	@Bean
	public Person personWithAddress(String name, int age, @Qualifier("navi-mumbai") Address address) {
		return new Person(name, age, address);
	}
	
	@Bean
	public Person vishal() {
		return new Person(name(), age(), new Address("Hadapsar", "Pune"));
	}
	
	@Bean
	@Primary // sets this as primary candidate when extraction from context is done with class name.
	public Address address() {
		return new Address("221 Bakers Street", "London");
	}
	
	@Bean // Spring manages creation
	@Qualifier("navi-mumbai") // gives a name to the bean to be extracted referred with.
	public Address address2() {
		return new Address("Vashi", "Navi Mumbai");
	}
}
