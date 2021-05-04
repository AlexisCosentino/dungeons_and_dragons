package enemies;

abstract public class Enemies {
	
	//ATTRIBUTES
	private String name = "Enemy";
	private int health = 6;
	private int strength = 1;


	public Enemies(String name, int health, int strength) {
		this.name = name;
		this.health = health;
		this.strength = strength;
	}

	@Override
	public String toString() {
		return "Vous êtes tombé sur un " + name +
				", Santée =" + health +
				", Force =" + strength;
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
}
