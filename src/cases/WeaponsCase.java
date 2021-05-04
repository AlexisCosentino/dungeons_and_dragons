package cases;

import powers.Power;
import weapons.Weapon;

public class WeaponsCase  extends Case  {
    private Weapon weapon;
    private Power power;
    private String sentence;

    public WeaponsCase(Weapon weapon){
        this.weapon = weapon;
        this.sentence = weapon.toString();
    }

    public WeaponsCase(Power power){
        this.power = power;
        this.sentence = power.toString();
    }

    @Override
    public String toString() {
        return sentence;
    }

}