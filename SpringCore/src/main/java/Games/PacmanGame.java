package Games;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacmanGame implements GamingConsole {

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("moving left");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("moving right");
	}

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("moving up");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("moving down");
	}

}
