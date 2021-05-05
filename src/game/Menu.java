package game;

import java.util.Scanner;
import character.Character;
import character.Warrior;
import character.Wizard;
import powers.Power;
import weapons.Weapon;


public class Menu {

	private Character player;
	private Weapon weapon;
	private Power power;
	private Scanner in = new Scanner(System.in);
	private String name;


	public Menu(){
		this.player = null;
		this.weapon = null;
		this.power = null;
	}
	


	public void welcome() {
		System.out.println("  |----------------------------------------------| ");
		System.out.println("==|  Bienvenue dans le jeu Dungeons & Dragons !  |==");
		System.out.println("  |----------------------------------------------|");
	}

	public void menu(){
		System.out.println("Tapez votre nom :");
		name = in.nextLine();
		System.out.println("Bonjour " + name + ", vous allez pleurer du sang aujourd'hui");
		System.out.println("il ya 64 cases a parcourir. Certaines vous donneront de meilleurs armes/potion et d'autre des enemies a combattre.");
		System.out.println("Tapez :");
		System.out.println("------------------------------------------------");
		System.out.println("1 -> Ceer votre personnage");
		System.out.println("2 -> Quitter le jeu");
		System.out.println("------------------------------------------------");
		int choice = in.nextInt();

			switch (choice){
				case 1:
					createChar();
					break;
				case 2:
					exit();
				default:
					System.out.println("Choix non valide");
					welcome();
			}
	}

	public void createChar(){
		System.out.println("Que voulez-vous jouer :");
		System.out.println("------------------------------------------------");
		System.out.println("1 -> MAGICIEN (Santée faible, Attaque forte)");
		System.out.println("2 -> GUERRIER (Santée forte, Attaque faible)");
		System.out.println("3 -> Quitter le jeu");
		System.out.println("------------------------------------------------");

		int choice = in.nextInt();

		switch (choice){
			case 1:
				player = new Wizard(name, power);
				System.out.println("Vous avez choisi d'etre un Magicien, NOM : " + player.getName() + ", SANTEE : " + player.getHealth() + " et FORCE : " + player.getStrength());
				break;
			case 2 :
				player = new Warrior(name, weapon);
				System.out.println("Vous avez choisi d'etre un Guerrier, NOM : " + player.getName() + ", SANTEE : " + player.getHealth() + " et FORCE : " + player.getStrength());
				break;
			case 3:
				exit();
			default:
				System.out.println("Choix non valide");
				createChar();
		}
		System.out.println("------------------------------------------------");

	}


	public void exit() {
		System.out.println("Bye bye petit lacheur..");
		System.exit(0);
	}
	


	public Character getPlayer() {
		return player;
	}

	public void setPlayer(Character player) {
		this.player = player;
	}
	
}
