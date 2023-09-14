package BeanScopes;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class Scopes {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(Scopes.class);

		/*
		 * output BeanScopes.SingeltonScope@376a0d86 BeanScopes.SingeltonScope@376a0d86
		 */
		System.out.println(context.getBean(SingeltonScope.class));
		System.out.println(context.getBean(SingeltonScope.class));
		/*
		 * BeanScopes.PrototypeScope@62656be4 BeanScopes.PrototypeScope@17d919b6
		 */
		System.out.println(context.getBean(PrototypeScope.class));
		System.out.println(context.getBean(PrototypeScope.class));
	}

}

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
class SingeltonScope {

}

//default
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class PrototypeScope {

}