package weapons;

public class Sword {
	private String name = "Sword";
	private int strength = 5;
	
	
	public Sword(String name, int strength) {
		this.name = name;
		this.strength = strength;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getStrength() {
		return strength;
	}


	public void setStrength(int strength) {
		this.strength = strength;
	}
}
