package game;


import cases.BalekCase;
import cases.Case;
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
	private Shop shop;




	public Gaming(Menu menu){

		this.menu = menu;
		this.board = new Board();
		this.player = menu.getPlayer();
		this.dice = new Dice();
		this.in = new Scanner(System.in);
		this.balek = new Balek();
		this.shop = new Shop(player);

	}


	public void launchGame(){
		Collections.shuffle(board.getListe(), new Random());	//RANDOM ARRAYLIST

		while (player.getHealth() > 0 && board.getIndexPlayer() < board.getListeSize()){
			wantPlay();

			int launchDice = dice.play();
			System.out.println();
			System.out.print("Vous avez joué " + launchDice);
			try {
				board.setIndexPlayer(board.getIndexPlayer() + launchDice);
				if (board.getIndexPlayer() > board.getListeSize()) {
					throw new PersonnageHorsPlateauException("erreur");
				}
			} catch (PersonnageHorsPlateauException e) {
				board.setIndexPlayer(board.getListeSize());
			}

			System.out.println(", vous êtes sur la case " + board.getIndexPlayer() +"/" + board.getListeSize());

			if ( board.getIndexPlayer() < board.getListeSize()) {							//Si mon index est inférieur a la taille du plateau //ENLEVER LA CONDITION !!
				Case currentCase = board.getListe().get(board.getIndexPlayer());

				System.out.println(currentCase.toString());								//J'annonce la case

				currentCase.interaction(player, board);								//Je fais l'intéraction

				System.out.println(player.toString());
				System.out.println();
			}
		}
		if (player.getHealth() <= 0) {
			gameOver();

		} else {
			board.getBalekCase().toString();
			board.getBalekCase().interaction(player, board);
			shop.buy();
			System.out.println(balek.toString());
			System.out.println(player.toString());
			menu.waitAndSee(500);
			((BalekCase) board.getBalekCase()).fightBalek(player, balek);


			if (player.getHealth() > 0){
				youWin();
			} else {
				gameOver();
			}

		}
	}



	public void wantPlay(){
			Scanner in = new Scanner(System.in);
			System.out.println("----------------------------------------------------------");


			System.out.println("Lancer le dé ?");
			System.out.println("1 -> oui      2 -> Je passe à la boutique		3 -> Non je quitte le jeu");

			int choice = in.nextInt();
			switch (choice) {
				case 1:
					dice.play();
					break;
				case 2:
					shop.buy();
					wantPlay();
					break;
				case 3:
					System.out.println("Aucune race pour quitter en cours de jeu ! CIAO !");
					System.exit(0);

				default:
					System.out.println("Choix non valide");
					wantPlay();
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


}

