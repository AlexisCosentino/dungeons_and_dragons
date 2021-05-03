package game;

////////////////// ICI SE TROUVE LE POINT D ENTREE DU JEU /////////////////////////////

public class Main {

	public static void main(String[] args) {
	Menu menu = new Menu();							//JE CONSTRUIS LE MENU
	menu.welcome();									//JE LANCE LE MENU POUR LA CREATION DU PERSONNAGE
	menu.menu();
	Gaming gaming = new Gaming(menu);				//JE LANCE LA CONSTRUCTION DU JEU AVEC MENU EN PARAM
	gaming.launchGame();							//JE LANCE LE JEUX
	gaming.replay();
	}

}
