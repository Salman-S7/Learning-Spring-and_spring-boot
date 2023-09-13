package BusinessCalculation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class RealWorldBusinessCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var Context = new AnnotationConfigApplicationContext(RealWorldBusinessCalculation.class);
		System.out.println(Context.getBean(BussinessCalculationService.class).findMax());

	}

}
