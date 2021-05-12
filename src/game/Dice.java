package game;


import java.util.concurrent.ThreadLocalRandom;

/**
 * objet representant le dé du jeu avec une méthode play qui permet de lancer le dé
 */
public class Dice {

	/**
	 * Attribut du dé qui est un entier entrer 1 et 6
	 */
	private int de;

	/**
	 * Constructeur du dé
	 */
	public Dice(){
		this.de = play();
	}


	/**
	 *
	 * @return un entier entre 1 et 6 qui correspond à la valeur du dé.
	 */
	public int play() {
		int randomNum = ThreadLocalRandom.current().nextInt(1, 6 + 1);
		return randomNum;
	}

	public int getDe() {

		return de;
	}

	public void setDe(int de) {

		this.de = de;
	}
	
	
}
