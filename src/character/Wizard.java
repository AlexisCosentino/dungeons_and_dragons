package character;

import powers.Power;


/**
 * Classe enfant de personnage qui représente un Magicien qui accepte des pouvoir, 3 points de vie et 8 points d'attaque
 */
public class Wizard extends Character {

	/**
	 * attribut propre à wizard de type objet pouvoir
	 */
	private Power power;

	/**
	 * Constructeur avec les parametres du parent
	 */
	public Wizard(){
		super("Magicien", 3, 8, 0);
		this.power = null;
	}

	/**
	 * Constructeur avec les parametres du parent
	 */
	public Wizard(String name, Power power) {
		super(name, 3, 8, 0);
		this.power = power;
	}



	@Override
	public String getLeftHand() {
		if (power != null){
			return power.getPowerName();
		} else {
			return "Pas de pouvoir";
		}
	}

	public Power getPower() {
		return power;
	}

	public void setPower(Power power) {
		this.power = power;
	}

}
