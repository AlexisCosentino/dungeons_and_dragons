package character;

import powers.Power;

public class Wizard extends Character {
	Power power;


	public Wizard(String name) {
		super(name, 3, 8);
	}


	@Override
	public String getLeftHand() {
		if (power != null){
			return power.getPowerName();
		} else {
			return "Pas de pouvoir";
		}
	}



}
