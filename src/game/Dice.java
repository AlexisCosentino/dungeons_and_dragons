package game;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
	
	int de = play();
	
	public int play() {
		int randomNum = ThreadLocalRandom.current().nextInt(1, 6 + 1);
		return randomNum;
	}

	public int getDe() {

		return de;
	}

	public void setDe(int de) {

		this.de = de;
	}
	
	
}
