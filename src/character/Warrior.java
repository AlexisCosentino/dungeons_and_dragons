package character;

import weapons.Weapon;

public class Warrior extends Character {
	
	//attributes
	private Weapon weapon;



	public Warrior(String name, Weapon weapon) {
		super(name, 5, 5, 0);
		this.weapon = weapon;
	}



	@Override
	public String getLeftHand() {
		if (weapon != null){
			return weapon.getWeaponName();
		} else {
			return "Pas d'arme";
		}
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
}
