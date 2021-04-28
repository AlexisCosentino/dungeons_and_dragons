package character;

public class Warrior {
	
	//attributes
	public String warriorName = "default";
	public int warriorHealth;
	public int warriorStrength;
	public String warriorImage;
	
	public Warrior() {
		
	}
	
	public Warrior(String name) {
	
	}
	
	public Warrior(String name, String img, int health, int strength) {
		warriorName = name;
		warriorImage = img;
		warriorHealth = health;
		warriorStrength = strength;
	}
	
	public String toString() {
		return "Le guerrier qui s'appelle " + this.warriorName + " , santé : " + this.warriorHealth + ", force : " + this.warriorStrength;
	}

}
