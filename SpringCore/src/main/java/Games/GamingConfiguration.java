package Games;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class GamingConfiguration {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
		context.getBean(GameRunner.class).run();

	}
}
