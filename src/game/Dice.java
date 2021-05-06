package game;

import character.Character;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Dice {

	private int de;
	private Shop shop;
	private Character player;

	public Dice(Character player){
		this.de = play();
		this.player = player;
		this.shop = new Shop(player);
	}

	public void launchDice(){
		Scanner in = new Scanner(System.in);
		System.out.println("----------------------------------------------------------");


		System.out.println("Lancer le dé ?");
		System.out.println("1 -> oui      2 -> Je passe à la boutique		3 -> Non je quitte le jeu");

		int choice = in.nextInt();
		switch (choice){
			case 1 :
				play();
				break;
			case 2:
				shop.buy();
				launchDice();
				break;
			case 3:
				System.out.println("Aucune race pour quitter en cours de jeu ! CIAO !");
				System.exit(0);

			default:
				System.out.println("Choix non valide");
				launchDice();
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
