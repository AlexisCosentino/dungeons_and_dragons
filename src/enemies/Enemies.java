/**
 * Package de tout les enemies que vous pouvez rencontrer dans le jeu
 */
package enemies;

/**
 * classe parent de tout les enemies que vous pouvez rencontrer dans le jeu
 */
abstract public class Enemies {


	/**
	 * Attributs nom, force, santée
	 */
	private String name;
	private int health;
	private int strength;


	/**
	 *
	 * @param name nom de l'ennemie
	 * @param health santée de l'enemie
	 * @param strength force de l'enemie
	 */
	public Enemies(String name, int health, int strength) {
		this.name = name;
		this.health = health;
		this.strength = strength;
	}

	/**
	 *
	 * @return une phrase
	 */
	@Override
	public String toString() {
		return "ENEMIE !!! ->  " + name +
				", VIE =" + health +
				", FORCE =" + strength;
	}

	public String getName() {
		return name;
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

    public String toStringFight() {
		return name + " ->  VIE : = " + health + ", FORCE = " + strength;
    }
}
