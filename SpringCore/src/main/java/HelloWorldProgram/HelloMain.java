package HelloWorldProgram;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class HelloMain {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(HelloMain.class);
		context.getBean(HelloWorldClass.class).printMesaage();
	}

}
