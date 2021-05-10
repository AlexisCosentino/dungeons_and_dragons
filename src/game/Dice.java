package game;


import java.util.concurrent.ThreadLocalRandom;

public class Dice {

	private int de;

	public Dice(){
		this.de = play();
	}


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
