package character;

import weapons.Sword;

public class Warrior {
	
	//attributes
	private String name = "default";
	private int health = 5;
	private int strength = 5;
	private String img = "url";
	private String weaponName;
	private int weaponStrength;
	private String shieldName;
	private int shieldStrength;
	
	
	public Warrior() {
		
	}
	
	public Warrior(String name) {
	
	}
	
	public Warrior(String name, String img, int health, int strength) {
		this.name = name;
		this.img = img;
		this.health = health;
		this.strength = strength;
		Sword weapon = new  Sword("Epée de l'apprentis", 5);
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
	
	public String getShieldName() {
		return shieldName;
	}

	public int getShieldStrength() {
		return shieldStrength;
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
	
	
	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}

	public void setWeaponStrength(int weaponStrength) {
		this.weaponStrength = weaponStrength;
	}

	public void setShieldName(String shieldName) {
		this.shieldName = shieldName;
	}
	
	public void setShieldStrength(int shieldStrength) {
		this.shieldStrength = shieldStrength;
	}
	
}
