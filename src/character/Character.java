package character;

/**
 * Classe parent des personnage de type héro de types abstraite
 */
abstract public class Character {

	/**
	 * Attributs des personnage de types joueurs pour le nom, force, santee, et argent
	 */
	private String name;
	private int health;
	private int strength;
	private int wallet;


	/**
	 * Consrtucteur du personnage avec les parametre dont il a besin pour assigner les attributs
	 * @param name
	 * @param health
	 * @param strength
	 * @param wallet
	 */
	public Character(String name, int health, int strength, int wallet) {
		this.name = name;
		this.health = health;
		this.strength = strength;
		this.wallet = wallet;
	}

	/**
	 *
	 * @return une action qui permet de prendre une arme en main
	 */
	public abstract String getLeftHand();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getWallet() {
		return wallet;
	}

	public void setWallet(int wallet) {
		this.wallet = wallet;
	}

	public String toString() {
		return name + " -> VIE : " + health + ", FORCE : " + strength + ", SKILL : " + getLeftHand();
	}
}
