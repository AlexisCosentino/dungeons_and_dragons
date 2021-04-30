package game;

import java.util.Scanner;

import character.Character;
import character.Warrior;
import character.Wizard;
import game.Dice;

public class Menu {

	Character player = null;

	public Menu(){
		
	}
	
	public void launchMenu(){
		System.out.println("Bienvenue dans le jeu Dungeons & Dragons !");
		System.out.println("Tapez 'exit' pour quitter le jeu");	
		System.out.println("Etes-vous prêt à jouer et pleurer du sang ? 'yes' / 'no'");
		Scanner in = new Scanner(System.in);
		String userChoice = in.nextLine();
		if ("yes".equalsIgnoreCase(userChoice)) {

			System.out.println("Magnifique !! Commencez par choisir votre personnage : 'magicien' / 'guerrier' ");
			userChoice = in.nextLine();
			if ("guerrier".equalsIgnoreCase(userChoice)) {
				System.out.println("Quel sera votret petit nom de guerrier victime ?");
				String userName = in.nextLine();

				player = new Warrior(userName);

				System.out.println("Vous avez choisi d'être un " + userChoice + ", votre nom sera : " + player.getName() + ", votre attaque sera de : " + player.getStrength() + " et votre santée de " + player.getHealth());


			} else if ("magicien".equalsIgnoreCase(userChoice)) {

				System.out.println("Quel sera votret petit nom de magicien victime ?");
				String userName = in.nextLine();

				player = new Wizard(userName);

				System.out.println("Vous avez choisi d'être un " + userChoice + ", votre nom sera : " + player.getName() + ", votre attaque sera de : " + player.getStrength() + " et votre santée de " + player.getHealth());

			} else if ("exit".equalsIgnoreCase(userChoice)) {
				exit();
			} else {
				launchMenu();
			}
			System.out.println("Le jeu est simple, il ya 64 cases à parcourir. Certaines vous donneront de meilleurs armes/potion et d'autre des enemies à combattre.");


			///// JOUONS !! ////////////////

			Board board = new Board();
			Dice dice = new Dice();

			while (player.getHealth() > 0 && board.getNbCase() < 64) {

				System.out.println("Lancer le dé ? yes / no");
				String play = in.nextLine();
				if ("yes".equalsIgnoreCase(play)) {
					int launchDice = dice.play();
					board.setNbCase(board.getNbCase() + launchDice);
					System.out.println("Vous avez joué " + launchDice + ", vous êtes sur la case " + board.getNbCase());

				} else {
					exit();
				}
			}
			if (player.getHealth() <= 0){
				System.out.println("Vous avez perdu !!");

			} else {
				System.out.println("Vous avez gagné !!");
				System.exit(0);
			}



		} else {
			exit();
		}

	}
	
	
	
	
	
	
	
	public void exit() {
		System.out.println("Bye bye petit lacheur..");
		System.exit(0);
	}
	
	
	public void answer(String userChoice, String choice1, String choice2) {
		if ("exit".equalsIgnoreCase(userChoice)) {
			exit();
		}else if (!choice1.equalsIgnoreCase(userChoice) || !choice2.equalsIgnoreCase(userChoice)) {
			launchMenu();
		}
	}
	
	
}
