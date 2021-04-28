package menu;

import character.Wizard;
import character.Warrior;
import java.util.Scanner;

public class Menu {
	
	public static void exit() {
		System.out.println("Bye bye petit lacheur..");
		System.exit(0);
	}

	
	public static void main(String[] args) {
		System.out.println("Bienvenue dans le jeu Dungeons & Dragons !");
		System.out.println("Tapez 'exit' pour quitter le jeu");		
		System.out.println("Etes-vous prêt à jouer et pleurer du sang ? 'yes' / 'no'");
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
				
				System.out.println("Vous avez choisi d'être un " + userChoice + ", votre nom sera : " + player.getName() + ", votre attaque sera de : " + player.getStrength() + " et votre santée de " + player.getHealth());

				
			} else if ("magicien".equalsIgnoreCase(userChoice)){
				
				System.out.println("Quel sera votret petit nom de magicien victime ?");
				String userName = in.nextLine();
				
				Wizard player = new Wizard(userName, userName, 3, 8);
				
				System.out.println("Vous avez choisi d'être un " + userChoice + ", votre nom sera : " + player.getName() + ", votre attaque sera de : " + player.getStrength() + " et votre santée de " + player.getHealth());

				
			} else if ("exit".equalsIgnoreCase(userChoice)){
				exit();
			}
			

			


		} else {
			exit();
		}
		

	}
}
