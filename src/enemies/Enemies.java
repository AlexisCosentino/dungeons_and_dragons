package enemies;

abstract public class Enemies {
	
	//ATTRIBUTES
	private String name;
	private int health;
	private int strength;


	public Enemies(String name, int health, int strength) {
		this.name = name;
		this.health = health;
		this.strength = strength;
	}

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
