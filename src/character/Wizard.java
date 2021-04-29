package character;

import powers.Storm;

public class Wizard {
	private String name = "default";
	private int health = 3;
	private int strength = 5;
	private String img = "url";
	private String weaponName;
	private int weaponStrength;
	private String potionName;
	private int potionStrength;


	
	public Wizard() {
		
	}
	
	public Wizard(String name) {
	
	}
	
	public Wizard(String name, String img, int health, int strength) {
		this.name = name;
		this.img = img;
		this.health = health;
		this.strength = strength;
		Storm weapon = new Storm("Tempete des Titans", 35);
		this.weaponName = weapon.getName();
		this.weaponStrength = weapon.getStrength();
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
	
	public String getWeaponName() {
		return weaponName;
	}
	
	public int getWeaponStrength() {
		return weaponStrength;
	}
	
	public String getPotionName() {
		return potionName;
	}
	
	public int getPotionStrength() {
		return potionStrength;
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
	
	public void setWeaponName(String a) {
		weaponName = a;
	}
	
	public void setWeaponStrength(int a) {
		weaponStrength = a;
	}
	
	public void setPotionName(String a) {
		potionName = a;
	}
	public void setPotionStrength(int a) {
		potionStrength = a;
	}

}
