package Games;

import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GamingConsole {

	@Override
	public void left() {
		System.out.println("move back..");

	}

	@Override
	public void right() {
		System.out.println("shoot..");

	}

	@Override
	public void up() {
		System.out.println("Jump..");

	}

	@Override
	public void down() {
		System.out.println("Sit down..");

	}

}
