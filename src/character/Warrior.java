package character;


public class Warrior extends Character {
	
	//attributes
	String weaponName = "";
	int weaponStrength = 0;
	

	
	public Warrior(String name) {
		super(name, 5, 5);
	
	}
	
	
	//GETTER
	
	public String getWeaponName() {
		return weaponName;
	}
	public int getWeaponStrength() {
		return weaponStrength;
	}

	
	//SETTER

	
	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}

	public void setWeaponStrength(int weaponStrength) {
		this.weaponStrength = weaponStrength;
	}
	
}
