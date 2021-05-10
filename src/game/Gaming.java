package game;


import cases.Case;
import cases.EnemiesCase;
import enemies.Balek;
import exceptions.PersonnageHorsPlateauException;
import character.Character;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Gaming {

	private Menu menu;
	private Scanner in;
	private Board board;
	private Dice dice;
	private Character player;
	private Balek balek;



	public Gaming(Menu menu){

		this.menu = menu;
		this.board = new Board();
		this.player = menu.getPlayer();
		this.dice = new Dice(player);
		this.in = new Scanner(System.in);
		this.balek = new Balek();

	}


	public void launchGame(){
		Collections.shuffle(board.getListe(), new Random());	//RANDOM ARRAYLIST

		while (player.getHealth() > 0 && board.getNbCase() < board.getListeSize()) {
			dice.launchDice();

			int launchDice = dice.play();
			System.out.println();
			System.out.print("Vous avez joué " + launchDice);
			try {
				board.setNbCase(board.getNbCase() + launchDice);
				if (board.getNbCase() > board.getListeSize()) {
					throw new PersonnageHorsPlateauException("erreur");
				}
			} catch (PersonnageHorsPlateauException e) {
				board.setNbCase(board.getListeSize());
			}

			System.out.println(", vous êtes sur la case " + board.getNbCase());

			if ( board.getNbCase() < board.getListeSize()) {							//Si mon index est inférieur a la taille du plateau
				Case currentCase = board.getListe().get(board.getNbCase());

				System.out.println(currentCase.toString());								//J'annonce la case

				currentCase.interaction(player);								//Je fais l'intéraction

				int choice = 0;
				if (currentCase instanceof EnemiesCase){								//Si c'est une case enemie
					while (((EnemiesCase) currentCase).getEnemies().getHealth() > 0 && choice != 2 && player.getHealth() > 0) {		//Tant que l'énemie est tjr en vie, que je veux me battre et que j'ai de la vie
						System.out.println();
						System.out.println(((EnemiesCase) currentCase).getEnemies().toStringFight());					//J'annonce l'état de l'énemie
						System.out.println(player.toString());												//Etat du joueur
						System.out.println("-------------------------");												//Je propose de se battre encore ou de partir
						System.out.println("1 -> SE BATTRE");
						System.out.println("2 -> FUIR TEL UN LACHE");
						System.out.println("-------------------------");
						choice = in.nextInt();
						switch (choice) {
							case 1:
								currentCase.interaction(player);				//Il se bat encore
								break;
							case 2:
								int goBack = dice.play();
								board.setNbCase(board.getNbCase() - goBack);			//il recule de quelques cases
								break;
						}
					}
				}


				System.out.println(player.toString());
				System.out.println();
			}
		}
		if (player.getHealth() <= 0) {
			gameOver();

		} else {
			meetBalek();
			fightBalek();

			if (player.getHealth() > 0){
				youWin();
			} else {
				gameOver();
			}

		}
	}




	public void replay(){
		System.out.println("Voulez vous rejouer ?");
		System.out.println("1 -> Yep");
		System.out.println("2 -> Nope");
		int choice = in.nextInt();
		switch (choice){
			case 1:
				Menu menu = new Menu();
				menu.welcome();									//JE LANCE LE MENU POUR LA CREATION DU PERSONNAGE
				menu.menu();
				Gaming gaming = new Gaming(menu);				//JE LANCE LA CONSTRUCTION DU JEU AVEC MENU EN PARAM
				gaming.launchGame();							//JE LANCE LE JEUX
				gaming.replay();

				break;
			case 2:
				System.out.println("C'est CIAO mon gars !");
				System.exit(0);
			default:
				System.out.println("Choix non valide");
				replay();
		}
	}

	public void gameOver(){
		System.out.println("       __..._   _...__");
		System.out.println("  _..-\"      `Y`      \"-._");
		System.out.println("  \\   GAME    |           /");
		System.out.println("  \\\\   OVER   |          //");
		System.out.println("  \\\\\\   !!    |         ///");
		System.out.println("   \\\\\\ _..---.|.---.._ ///");
		System.out.println("    \\\\`_..---.Y.---.._`//");
		System.out.println("     '`               `'");
	}

	public void youWin(){
		System.out.println("       __..._   _...__");
		System.out.println("  _..-\"      `Y`      \"-._");
		System.out.println("  \\   TU AS   |           /");
		System.out.println("  \\\\   GAGNE  |          //");
		System.out.println("  \\\\\\   !!    |         ///");
		System.out.println("   \\\\\\ _..---.|.---.._ ///");
		System.out.println("    \\\\`_..---.Y.---.._`//");
		System.out.println("     '`               `'");
	}

	public void meetBalek(){
		System.out.println("Tu es arrivé au bout du jeu !!");
		menu.waitAndSee(500);
		System.out.println("B");
		menu.waitAndSee(500);
		System.out.println("BOO");
		menu.waitAndSee(500);
		System.out.println("BOOOO");
		menu.waitAndSee(500);
		System.out.println("BOOOOOOOOM !!!");
		menu.waitAndSee(500);
		System.out.println("Putain !! " + balek.getName() + " est la !!");
		System.out.println("Voici quelques 20 pieces d'or et va acheter ce dont tu as besoin pour lui nike sa race");
		player.setWallet(player.getWallet() + 20);
		menu.waitAndSee(1500);
		dice.getShop().buy();
		System.out.println(balek.toString());
		System.out.println(player.toString());
		menu.waitAndSee(500);
	}

	public void fightBalek(){
		while (player.getHealth() > 0 && balek.getHealth() > 0) {
			if (player.getStrength() >= balek.getHealth()) {
				balek.setHealth(0);
				System.out.println();
				System.out.println(player.getName() + " -> a perdu 0 de vie");
				System.out.println(balek.getName() + " -> a perdu toute sa vie");
				System.out.println(balek.balekIsDead());
			} else {
				balek.setHealth(balek.getHealth() - player.getStrength());
				player.setHealth(player.getHealth() - balek.getStrength());
				System.out.println();
				System.out.println(player.getName() + " -> a perdu -" + balek.getStrength() + " de vie");
				System.out.println(balek.getName() + " -> a perdu -" + player.getStrength() + " de vie");
			}
			if ( balek.getHealth() > 0 ) {
				System.out.println();
				System.out.println(balek.toString());
				System.out.println(player.toString());
				System.out.println("-------------------------");                                                //Je propose de se battre encore ou de partir
				System.out.println("1 -> SE BATTRE");
				System.out.println("2 -> FUIR TEL UN LACHE");
				System.out.println("-------------------------");
				int choice = in.nextInt();
				switch (choice) {
					case 1:
						fightBalek();                //Il se bat encore
						break;
					case 2:
						System.out.println("Impossible de fuir mon gars, bagarre jusqu'à la mort !!");
						menu.waitAndSee(3000);
						fightBalek();
						break;
				}
			}
		}
	}

}

