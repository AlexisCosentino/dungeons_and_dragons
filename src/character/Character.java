package character;

abstract public class Character {
	
	//attributes;;
	private String name;
	private int health;
	private int strength;
	private int wallet;
	
	public Character(String name, int health, int strength, int wallet) {
		this.name = name;
		this.health = health;
		this.strength = strength;
		this.wallet = wallet;
	}

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
