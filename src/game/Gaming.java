package game;

import java.util.Scanner;

import character.Character;
import game.Menu;

public class Gaming {

	public  void launchGame() {
		Menu menu= new Menu();
		Scanner in = new Scanner(System.in);
		System.out.println("Lancer le d� ? yes / no");
		String play = in.nextLine();
		if ("yes".equalsIgnoreCase(play)) {
		} else {
			menu.exit();
		}

	}
}
