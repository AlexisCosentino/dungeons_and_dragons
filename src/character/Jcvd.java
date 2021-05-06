package character;

import powers.Power;
import weapons.Weapon;

public class Jcvd extends Character{
    private Power power;

    public Jcvd(String name, Power power){
        super(name, 6,6, 0);
        this.power = power;
    }

    @Override
    public String getLeftHand() {

        if (power != null){
            return power.getPowerName();
        } else {
            return "J'adore l'eau, dans 20 - 30 ans il y en n'aura plus !";
        }
    }

    public void setPower(Power power) {
        this.power = power;
    }

}
