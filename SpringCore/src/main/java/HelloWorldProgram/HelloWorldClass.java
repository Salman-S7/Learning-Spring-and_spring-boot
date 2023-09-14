package HelloWorldProgram;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldClass implements HelloWorldInterface {

	@Override
	public void printMesaage() {
		// TODO Auto-generated method stub
		System.out.println("Hello World..!!!");

	}

}
