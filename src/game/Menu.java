package game;

import java.util.Scanner;
import character.Character;
import character.Warrior;
import character.Wizard;
import character.Jcvd;
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
		waitAndSee(500);
		System.out.println("Tapez votre nom :");
		name = in.nextLine();
		System.out.println("Bonjour " + name + ", vous allez pleurer du sang aujourd'hui");
	}

	public void menu(){
		System.out.println();
		System.out.println("<=======|" + name + "|=======>");
		System.out.println("------------------------------------------------");
		System.out.println("1 -> Jouer");
		System.out.println("2 -> Creer votre personnage");
		System.out.println("3 -> Instruction");
		System.out.println("4 -> Quitter");
		System.out.println("------------------------------------------------");
		int choice = in.nextInt();

			switch (choice){
				case 1:
					startPlay();
					break;
				case 2:
					createChar();
					break;
				case 3:
					rules();
					break;
				case 4:
					exit();
				default:
					System.out.println("Choix non valide");
					welcome();
			}
	}

	public void createChar(){
		System.out.println("Que voulez-vous jouer :");
		System.out.println("------------------------------------------------");
		System.out.println("1 -> MAGICIEN (Santee faible, Attaque forte)");
		System.out.println("2 -> GUERRIER (Santee forte, Attaque faible)");
		System.out.println("4 -> Quitter le jeu");
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
				player = new Jcvd("Jean-Claude Van Damme", power);
				System.out.println("Vous avez choisi d'etre " + player.getName() + ", SANTEE : " + player.getHealth() + " et FORCE : " + player.getStrength());
				System.out.println("Vous aurez la santee d'un guerrier et les armes d'un magicien");
				break;
			case 4:
				exit();

			default:
				System.out.println("Choix non valide");
				createChar();
		}
		waitAndSee(1000);
		menu();
	}


	public void exit() {
		System.out.println("Bye bye petit lacheur..");
		System.exit(0);
	}

	public void startPlay(){
		if (player == null){
			System.out.println("Creez votre personnage avant de jouer !");
			System.out.println();
			waitAndSee(1000);
			menu();
		}
	}

	public void rules(){
		System.out.println("--------------------------------");
		System.out.println("Il y a 64 cases a parcourir");
		waitAndSee(800);
		System.out.println("Chaque cases cachent un element. ");
		waitAndSee(800);
		System.out.println("Parfois pour le meilleur et parfois pour le pire...");
		waitAndSee(800);
		System.out.println("Vous pouvez jouer un guerrier ou un magicien");
		waitAndSee(800);
		System.out.println("Le guerrier a beaucoup de vie et moins de force");
		System.out.println("Il peut prendre des armes mais pas des pouvoirs");
		waitAndSee(800);
		System.out.println("Le magicien a peu de vie mais une grande force");
		System.out.println("Il peut prendre des pouvoirs magiques mais pas des armes");
		waitAndSee(800);
		System.out.println("Lancez votre de, avancez et survivez jusqu'a la fin pour gagner");
		waitAndSee(800);
		System.out.println("Bon courage gamin !");
		System.out.println("--------------------------------");
		waitAndSee(2000);
		menu();
	}
	
	public void waitAndSee(int time){
		try
		{
			Thread.sleep(time);
		}
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}

	public Character getPlayer() {
		return player;
	}

	public void setPlayer(Character player) {
		this.player = player;
	}
	
}
