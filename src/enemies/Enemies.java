package enemies;

abstract public class Enemies {
	
	//ATTRIBUTES
	private int health = 6;
	private int strength = 1;
	
	public Enemies(int health, int strength) {
		this.health = health;
		this.strength = strength;
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
