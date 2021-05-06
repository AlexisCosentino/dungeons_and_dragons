package character;

import powers.Power;
import weapons.Weapon;

public class Wizard extends Character {
	private Power power;



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
