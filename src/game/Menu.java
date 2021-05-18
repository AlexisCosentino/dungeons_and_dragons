package game;


import java.util.Scanner;

import bdd.Driver;
import character.Character;
import powers.Power;
import weapons.Weapon;

/**
 * Ceci est le menu du jeu avec une méthode qui permet d'accéder au menu général du jeu, creer un personnage, voir le reglement,
 * quitter le jeu et le lancer.
 */
public class Menu {


	/**
	 * Attribut dont la classe menu aura besoin tel que les personnage, les armes... et le prénom du joueur
	 */
	private Character player;
	private Weapon weapon;
	private Power power;
	private Scanner in;
	private String name;
	private Driver bdd;
	private int savedIndex;


	/**
	 * Constructeur du menu avec l'instanciation des objets dont il a besoin
	 */
	public Menu(){
		this.player = null;
		this.weapon = null;
		this.power = null;
		this.in = new Scanner(System.in);
		this.bdd = new Driver();
		this.savedIndex = 0;

	}


	/**
	 * Méthode simple qui annonce la bienvenue dans le jeu et qui récupére le prénom du joueur
	 */
	public void welcome() {
		System.out.println("  |----------------------------------------------| ");
		System.out.println("==|  Bienvenue dans le jeu Dungeons & Dragons !  |==");
		System.out.println("  |----------------------------------------------|");
		System.out.println("		        ,     \\    /      ,        ");
		System.out.println("		       / \\    )\\__/(     / \\       ");
		System.out.println("		      /   \\  (_\\  /_)   /   \\      ");
		System.out.println("		 ____/_____\\__\\@  @/___/_____\\____ ");
		System.out.println("		|             |\\../|              |");
		System.out.println("		|              \\VV/               |");
		System.out.println("		|        R U READY TO DIE ?       |");
		System.out.println("		|_________________________________|");
		System.out.println("		 |    /| /      \\\\       \\ |\\    |");
		System.out.println("		 |  /   V        ))       V   \\  |");
		System.out.println("		 |/     `       //        '     \\|");
		System.out.println("		 `              V                '");

		waitAndSee(500);
		System.out.println("Tapez votre nom :");
		name = in.nextLine();
		System.out.println("Bonjour " + name + ", vous allez pleurer du sang aujourd'hui");
	}


	/**
	 * Le vrai menu du jeu avec le choix entrer jouer, creer un perso, lire les instruction ou quitter
	 */
	public void menu(){
		System.out.println();
		System.out.println("<=======|" + name + "|=======>");
		System.out.println("------------------------------------------------");
		System.out.println("1 -> Jouer");
		System.out.println("2 -> Creer votre personnage");
		System.out.println("3 -> Charger");
		System.out.println("4 -> Best Score");
		System.out.println("5 -> Instruction");
		System.out.println("6 -> Quitter");
		System.out.println("------------------------------------------------");
		int choice = in.nextInt();

			switch (choice){
				case 1:
					startPlay();
					break;
				case 2:
					createChar();
					break;
				case 3 :
					chargeGame();
				case 4:
					System.out.print("  NOM   -");
					System.out.print("   GENRE   -");
					System.out.print("   SANTEE   -");
					System.out.print("   FORCE   -");
					System.out.print("   ARMES   -");
					System.out.println("   ARGENT   -");
					System.out.println("");
					bdd.dbQuery("SELECT * FROM score ORDER BY health DESC");
					menu();
					break;
				case 5:
					rules();
					break;
				case 6:
					exit();
				default:
					System.out.println("Choix non valide");
					menu();
			}
	}



	/**
	 * méthode qui permet de creer un personnage pour jouer le jeu
	 */
	public void createChar() {
		System.out.println("Que voulez-vous jouer :");
		System.out.println("------------------------------------------------");
		System.out.println("Wizard --> (Santee faible, Attaque forte)");
		System.out.println("Warrior --> (Santee forte, Attaque faible)");
		System.out.println("Jcvd --> (Santee forte, Attaque forte)");
		System.out.println("exit --> Quitter le jeu");
		System.out.println("------------------------------------------------");
		Scanner scan = new Scanner(System.in);
		String userChoice = scan.nextLine();
		if ("exit".equalsIgnoreCase(userChoice)){
			exit();
		} else {
			try {
				Class<?> currentHero = Class.forName("character." + userChoice);
				Character player = (Character) currentHero.newInstance();
				player.setName(name);
				System.out.println("Vous avez choisi d'etre " + userChoice + ", SANTEE : " + player.getHealth() + " et FORCE : " + player.getStrength());
				this.player = player;
			} catch (Exception e) {
				System.out.println("Cette classe n'existe pas !");
				createChar();
			} catch (NoClassDefFoundError e){
				System.out.println("Cette classe n'existe pas !");
				createChar();
			}
		}
		waitAndSee(1000);
		menu();
	}


	/**
	 * Méthode pour quitter le jeu
	 */
	public void exit() {
		System.out.println("Bye bye petit lacheur..");
		System.exit(0);
	}

	/**
	 * Méthode qui vérifie si le joueur à bien créé son personnage avant de lancer le jeu
	 */
	public void startPlay(){
		if (player == null){
			System.out.println("Creez votre personnage avant de jouer !");
			System.out.println();
			waitAndSee(1000);
			menu();
		}
	}

	/**
	 * Réglement du jeu
	 */
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


	/**
	 * Méthode qui permet de faker un loading et qui prend du temps en millieme de sec en parametre
	 * @param time
	 */
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


	public void chargeGame() {
		System.out.print("  ID   -");
		System.out.print("   NOM   -");
		System.out.print("   GENRE   -");
		System.out.print("   SANTEE   -");
		System.out.print("   FORCE   -");
		System.out.print("   ARMES   -");
		System.out.print("   ARGENT   -");
		System.out.println("   CASE   -");
		System.out.println("");
		getBdd().showSavedGame("SELECT * FROM savedGame");
		System.out.println("");
		System.out.println("Entrez l'id du jeu à charger :");
		int choice = in.nextInt();
		try {
		//	Class<?> currentHero = Class.forName("character." + bdd.getStringData("SELECT * FROM savedgame WHERE id = " + choice + ";", "type"));
			System.out.println(bdd.getType(choice));
			Class<?> currentHero = Class.forName("character." + bdd.getType(choice));
			player = (Character) currentHero.newInstance();

		} catch (Exception e) {
			System.out.println("Cette classe n'existe pas !");
			createChar();
		}
		player.setHealth(bdd.getIntData("SELECT health from savedgame WHERE id = "+choice+"", "health"));
		player.setStrength(bdd.getIntData("SELECT strength from savedgame WHERE id = "+choice+"", "strength"));
		player.setWallet(bdd.getIntData("SELECT money from savedgame WHERE id = "+choice+"", "money"));
		savedIndex = bdd.getIntData("SELECT position FROM savedgame WHERE id = "+choice+"", "position");
		waitAndSee(1000);
		menu();
	}

	public int getSavedIndex(){return savedIndex;}

	public Character getPlayer() {
		return player;
	}

	public Driver getBdd(){ return bdd;}

	public void setPlayer(Character player) {
		this.player = player;
	}


}
