package game;


import cases.Case;
import cases.EnemiesCase;
import exceptions.PersonnageHorsPlateauException;

import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Gaming {

	private Menu menu;
	private Scanner in = new Scanner(System.in);


	public Gaming(Menu menu){
		this.menu = menu;
	}


	public void launchGame(){
		Board board = new Board();
		Dice dice = new Dice();

		Collections.shuffle(board.getListe(), new Random());	//RANDOM ARRAYLIST

		while (menu.getPlayer().getHealth() > 0 && board.getNbCase() < board.getListeSize()) {
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

				currentCase.interaction(menu.getPlayer());								//Je fais l'intéraction

				int choice = 0;
				if (currentCase instanceof EnemiesCase){								//Si c'est une case enemie
					while (((EnemiesCase) currentCase).getEnemies().getHealth() > 0 && choice != 2 && menu.getPlayer().getHealth() > 0) {		//Tant que l'énemie est tjr en vie, que je veux me battre et que j'ai de la vie
						System.out.println();
						System.out.println(((EnemiesCase) currentCase).getEnemies().toStringFight());					//J'annonce l'état de l'énemie
						System.out.println(menu.getPlayer().toString());												//Etat du joueur
						System.out.println("-------------------------");												//Je propose de se battre encore ou de partir
						System.out.println("1 -> SE BATTRE");
						System.out.println("2 -> FUIR TEL UN LACHE");
						System.out.println("-------------------------");
						choice = in.nextInt();
						switch (choice) {
							case 1:
								currentCase.interaction(menu.getPlayer());				//Il se bat encore
								break;
							case 2:
								int goBack = dice.play();
								board.setNbCase(board.getNbCase() - goBack);			//il recule de quelques cases
								break;
						}
					}
				}


				System.out.println(menu.getPlayer().toString());
				System.out.println();
			}
		}
		if (menu.getPlayer().getHealth() <= 0) {

			System.out.println("-----------------------");
			System.out.println("|  Vous avez perdu !!  |");
			System.out.println("-----------------------");

		} else {
			System.out.println("-----------------------");
			System.out.println("|  Vous avez gagné !!  |");
			System.out.println("-----------------------");

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
		}
	}



}

