package character;

public class Wizard {
	String wizardName;
	int wizardHealth;
	int wizardStrength;
	String wizardImage;

	
	public Wizard() {
		
	}
	
	public Wizard(String name) {
	
	}
	
	public Wizard(String name, String img, int health, int strength) {
		wizardName = name;
		wizardImage = img;
		wizardHealth = health;
		wizardStrength = strength;
	}
	
	public String toString() {
		return "Le Sorcier qui s'appelle " + this.wizardName + " , santé : " + this.wizardHealth + ", force : " + this.wizardStrength;
	}

}
