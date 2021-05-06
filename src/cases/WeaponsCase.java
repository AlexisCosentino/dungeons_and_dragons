package cases;

import character.*;
import character.Character;
import exceptions.MaxStrengthException;
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

            //// EXCEPTION FOR MAX STRENGTH /////////////////// EVEN ITS NOT REALLY POSSIBLE WITHOUT CHEAT

            try {
                if (player.getStrength() > 10 ) {
                    throw new MaxStrengthException();
                }
            } catch (MaxStrengthException e) {
                player.setStrength(10);
            }
        } else if (player instanceof Jcvd){
            System.out.println("==> JCVD pense que les armes c'est pour les faibles");
        } else {
            System.out.println("==> Un Magicien n'accepte pas des armes de PD");
        }


    }

}
