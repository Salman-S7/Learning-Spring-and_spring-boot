package Games;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("mario")
public class MarioGame implements GamingConsole {

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("moving back");

	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("moving forward");
	}

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("jump..");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("go into hole");
	}

}
