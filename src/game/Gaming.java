package game;


import exceptions.PersonnageHorsPlateauException;
import java.util.Scanner;

public class Gaming {

	private Menu menu;
	private Scanner in = new Scanner(System.in);


	public Gaming(Menu menu){
		this.menu = menu;
	}

/*
	public void launchGame(){
		Board board = new Board();
		Dice dice = new Dice();
		while (menu.getPlayer().getHealth() > 0 && board.getNbCase() < 64) {
			dice.launchDice();

				int launchDice = dice.play();

			System.out.println();
			System.out.print("Vous avez joué " + launchDice);
				try {
					board.setNbCase(board.getNbCase() + launchDice);
					if (board.getNbCase() > board.getBoard().length) {
						throw new PersonnageHorsPlateauException("erreur");
					}
				} catch (PersonnageHorsPlateauException e) {
					board.setNbCase(board.getBoard().length);
				}
				System.out.println(", vous êtes sur la case " + board.getNbCase());
				System.out.println("VIE : " + menu.getPlayer().getHealth() + ", FORCE : " + menu.getPlayer().getStrength() +", ARME : " + menu.getPlayer().getLeftHand());
			System.out.println();
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


 */
	public void launchGame(){
		Board board = new Board();
		Dice dice = new Dice();
		while (menu.getPlayer().getHealth() > 0 && board.getNbCase() < board.getListe().size()) {
			dice.launchDice();

			int launchDice = 1;

			System.out.println();
			System.out.print("Vous avez joué " + launchDice);
			try {
				board.setNbCase(board.getNbCase() + launchDice);
				if (board.getNbCase() > board.getListe().size()) {
					throw new PersonnageHorsPlateauException("erreur");
				}
			} catch (PersonnageHorsPlateauException e) {
				board.setNbCase(board.getListe().size());
			}
			System.out.println(", vous êtes sur la case " + board.getNbCase());
			System.out.println(board.getListe().get(board.getNbCase()).toString());
			System.out.println("VIE : " + menu.getPlayer().getHealth() + ", FORCE : " + menu.getPlayer().getStrength() +", ARME : " + menu.getPlayer().getLeftHand());
			System.out.println();
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

