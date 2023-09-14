package PostconstructAndPredestroy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Configuration
@ComponentScan
public class PostConstructPreDestroyConfiguration {
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(PostConstructPreDestroyConfiguration.class)) {
			context.getBean(SomeComponent.class);
		}
	}

}

@Component
class SomeComponent {
	private SomeDependancies dependancies;

	public SomeComponent(SomeDependancies dependancies) {
		this.dependancies = dependancies;
		System.out.println("All dependancies are ready");
	}

	@PostConstruct
	public void initialize() {
		dependancies.getReady();
	}

	@PreDestroy
	public void terminate() {
		System.out.println("terminated");
	}
}

@Component
class SomeDependancies {
	public void getReady() {
		System.out.println("ready to run");
	}
}
