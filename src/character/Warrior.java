package character;

import weapons.Weapon;


/**
 * Classe enfant de personnage qui représente un guerrier qui accepte des armes, 5points de vie et 5 poins d'attaque
 */
public class Warrior extends Character {

	/**
	 * attribut propre à warrior de type objet arme
	 */
	private Weapon weapon;

	/**
	 * Constructeur avec les parametres du parent
	 */
	public Warrior(){
		super("Guerrier", 5, 5, 0, "Warrior");
		this.weapon = weapon;
	}

	/**
	 * Constructeur avec les parametres du parent
	 */
	public Warrior(String name, Weapon weapon) {
		super(name, 5, 5, 0, "Warrior");
		this.weapon = weapon;
	}



	@Override
	public String getLeftHand() {
		if (weapon != null){
			return weapon.getWeaponName();
		} else {
			return "vide";
		}
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
}
