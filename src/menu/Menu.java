package menu;

import character.Wizard;
import character.Warrior;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Menu {
	
	public static void exit() {
		System.out.println("Bye bye petit lacheur..");
		System.exit(0);
	}
	
	public static int play() {
		int randomNum = ThreadLocalRandom.current().nextInt(1, 6 + 1);
		return randomNum;
	}

	
	public static void main(String[] args) {
		System.out.println("Bienvenue dans le jeu Dungeons & Dragons !");
		System.out.println("Tapez 'exit' pour quitter le jeu");	
		int de = play();
		System.out.println(de);
		System.out.println("Etes-vous pr�t � jouer et pleurer du sang ? 'yes' / 'no'");
		Scanner in = new Scanner(System.in);
		String userChoice = in.nextLine();
		userChoice.toString();
		
		if ("yes".equalsIgnoreCase(userChoice)) {
			
			System.out.println("Magnifique !! Commencez par choisir votre personnage : 'magicien' / 'guerrier' ");
			userChoice = in.nextLine();
			
			if ("guerrier".equalsIgnoreCase(userChoice)) {
				System.out.println("Quel sera votret petit nom de guerrier victime ?");
				String userName = in.nextLine();
				
				Warrior player = new Warrior(userName, userName, 5, 5);
				
				System.out.println("Vous avez choisi d'�tre un " + userChoice + ", votre nom sera : " + player.getName() + ", votre attaque sera de : " + player.getStrength() + " et votre sant�e de " + player.getHealth());
				System.out.println("Votre arme de base sera " + player.getWeaponName() + ", avec " + player.getWeaponStrength() + " de points d'attaque");

				
			} else if ("magicien".equalsIgnoreCase(userChoice)){
				
				System.out.println("Quel sera votret petit nom de magicien victime ?");
				String userName = in.nextLine();
				
				Wizard player = new Wizard(userName, userName, 3, 8);

				System.out.println("Vous avez choisi d'�tre un " + userChoice + ", votre nom sera : " + player.getName() + ", votre attaque sera de : " + player.getStrength() + " et votre sant�e de " + player.getHealth());
				System.out.println("Votre arme de base sera " + player.getWeaponName() + ", avec " + player.getWeaponStrength() + " de points d'attaque");

				
			} else if ("exit".equalsIgnoreCase(userChoice)){
				exit();
			}
			System.out.println("Le jeu est simple, il ya 64 cases � parcourir. Certaines vous donneront de meilleurs armes/potion et d'autre des enemies � combattre.");
			System.out.println("Lancer le d� ? yes / no");
			String play = in.nextLine();
			if ("yes".equalsIgnoreCase(play)) {
				
			} else {
				exit();
			}

			


		} else {
			exit();
		}
		

	}
}
