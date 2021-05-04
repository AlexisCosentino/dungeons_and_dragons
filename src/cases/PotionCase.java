package cases;

import exceptions.MaxHealthException;
import potions.Potion;
import character.Character;
import character.*;

public class PotionCase  extends Case {
    private Potion potion;
    private String sentence;

    public PotionCase(Potion potion){
        this.potion = potion;
        this.sentence = potion.toString();
    }

    @Override
    public String toString() {
        return sentence;
    }


    @Override
    public void interaction(Character player) {
        player.setHealth(player.getHealth() + potion.getStrength());

        //EXCEPTION FOR MAXIMUM HEALTH////////////////////

        if (player instanceof Wizard){
            try {
                if (player.getHealth() > 6 ) {
                    throw new MaxHealthException();
                }
            } catch (MaxHealthException e) {
                player.setHealth(6);
            }
        } else {
            try {
                if (player instanceof Warrior && player.getHealth() > 10 ) {
                    throw new MaxHealthException();
                }
            } catch (MaxHealthException e) {
                player.setHealth(10);
            }
        }
    }
}


