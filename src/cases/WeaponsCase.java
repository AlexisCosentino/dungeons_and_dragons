package cases;

import powers.Power;
import weapons.Weapon;

public class WeaponsCase  extends Case  {
    private Weapon weapon;
    private Power power;

    public WeaponsCase(Weapon weapon){
        this.weapon = weapon;
    }

    public WeaponsCase(Power power){
        this.power = power;
    }

}
