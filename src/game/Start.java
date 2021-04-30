package game;
import character.Character;



public class Start {

	public static void main(String[] args) {
	Menu menu = new Menu();
	Gaming gaming = new Gaming();
	menu.launchMenu();
	gaming.launchGame();
	}

}
