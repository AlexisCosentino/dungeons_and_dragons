package game;


import cases.Case;
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

			if ( board.getNbCase() < board.getListeSize()) {
				Case currentCase = board.getListe().get(board.getNbCase());
				currentCase.interaction(menu.getPlayer());
				System.out.println(currentCase.toString());
				System.out.println("VIE : " + menu.getPlayer().getHealth() + ", FORCE : " + menu.getPlayer().getStrength() + ", ARME : " + menu.getPlayer().getLeftHand());
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
				launchGame();
				break;
			case 2:
				System.out.println("C'est CIAO mon gars !");
				System.exit(0);
		}
	}



}

