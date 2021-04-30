package game;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Dice {

	private int de = play();

	public void launchDice(){
		Scanner in = new Scanner(System.in);
		System.out.println("----------------------------------------------------------");

		System.out.println("Lancer le dé ? 1 -> oui      2 -> Non je quitte le jeu");
		int choice = in.nextInt();
		switch (choice){
			case 1 :
				play();
				break;
			case 2:
				System.out.println("Aucune race pour quitter en cours de jeu ! CIAO !");
				System.exit(0);
		}
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
