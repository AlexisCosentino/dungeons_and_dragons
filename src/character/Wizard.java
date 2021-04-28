package character;

import powers.Storm;

public class Wizard {
	private String name = "default";
	private int health = 3;
	private int strength = 5;
	private String img = "url";
	private Storm weapon;


	
	public Wizard() {
		
	}
	
	public Wizard(String name) {
	
	}
	
	public Wizard(String name, String img, int health, int strength) {
		this.name = name;
		this.img = img;
		this.health = health;
		this.strength = strength;
		this.weapon = new Storm("Tempete des Titans", 35);
	}
	
	
	//GETTER
	
	public String getName() {
		return name;
	}
	
	public int getHealth() {
		return health;
	}
	
	public int getStrength() {
		return strength;
	}
	
	public String getImage() {
		return img;
	}
	
	
	//SETTER
	
	public void setName(String a) {
		name = a;
	}
	
	public void setHealth(int a) {
		health = a;
	}
	
	public void setName(int a) {
		strength = a;
	}
	
	public void setImage(String a) {
		img = a;
	}
	
	
	
	/*
	public String toString() {
		return "Le Sorcier qui s'appelle " + this.wizardName + " , santé : " + this.wizardHealth + ", force : " + this.wizardStrength;
	}
	*/

}
