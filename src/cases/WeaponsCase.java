package cases;

import character.*;
import character.Character;
import exceptions.MaxStrengthException;
import powers.Power;
import weapons.Weapon;

public class WeaponsCase extends Case  {
    private Weapon weapon;
    private String sentence;

    public WeaponsCase(Weapon weapon){
        this.weapon = weapon;
        this.sentence = weapon.toString();
    }


    @Override
    public String toString() {
        return sentence;
    }

    @Override
    public void interaction(Character player) {
        if (player instanceof Warrior){

            if (player.getLeftHand() == null) {
                ((Warrior) player).setWeapon(weapon);
                player.setStrength(player.getStrength() + weapon.getWeaponStrength());
            } else if (player.getLeftHand() != weapon.getWeaponName()){
                ((Warrior) player).setWeapon(weapon);
                player.setStrength(5 + weapon.getWeaponStrength());
            }
            try {
                if (player.getStrength() > 10 ) {
                    throw new MaxStrengthException();
                }
            } catch (MaxStrengthException e) {
                player.setStrength(10);
            }
        }


    }

}
