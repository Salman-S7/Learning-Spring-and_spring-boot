package LazyAndEagerInitialization;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class LazyEagerIntialization {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(LazyEagerIntialization.class)) {

			System.out.println(context.getBean(ClassA.class));

			System.out.println(context.getBean(ClassB.class));

		}

	}
}

@Component
@Lazy
class ClassA {

}

@Component
class ClassB {

}