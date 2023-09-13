package TypesOfDI;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class DITypes {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(DITypes.class);
		Arrays.asList(context.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println(context.getBean(Business.class));

	}
}

@Component
class Business {
	Dependancy1 dependancy1;
	Dependancy2 dependancy2;
	/*
	 * this is Field Injection : dependencies are injected using reflection
	 * 
	 * @Autowired Dependancy1 dependancy1;
	 * 
	 * @Autowired Dependancy2 dependancy2;
	 * 
	 * @Override public String toString() { return "Business [dependancy1=" +
	 * dependancy1 + ", dependancy2=" + dependancy2 + "]"; }
	 */

	/*
	 * setter injection
	 * 
	 * 
	 * @Autowired public void setDependancy1(Dependancy1 dependancy1) {
	 * System.out.println("setting dependency from setter"); this.dependancy1 =
	 * dependancy1; }
	 * 
	 * @Autowired public void setDependancy2(Dependancy2 dependancy2) {
	 * System.out.println("setting dependency from setter"); this.dependancy2 =
	 * dependancy2; }
	 * 
	 */

	// constructor injection ==> Recommended
	// no need of @Autowired annotation(optional)

	public Business(Dependancy1 dependancy1, Dependancy2 dependancy2) {
		super();
		System.out.println("setting dependency from Constructor");
		this.dependancy1 = dependancy1;
		this.dependancy2 = dependancy2;
	}
}

@Component
class Dependancy1 {

}

@Component
class Dependancy2 {

}
