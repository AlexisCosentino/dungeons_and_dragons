package cases;

import exceptions.MaxHealthException;
import game.Board;
import potions.Potion;
import character.Character;
import character.*;


/**
 * Classe enfant de case pour les potions
 */
public class PotionCase  extends Case {

    /**
     * Attribut propre a cette case qui représente l'objet potion
     */
    private Potion potion;


    /**
     * Constructeur de cette case potion avec une potion en parametre
     * @param potion
     */
    public PotionCase(Potion potion){
        super(potion.toString());
        this.potion = potion;
    }


    @Override
    public void interaction(Character player, Board board) {
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
        } else if (player instanceof Warrior ){
            try {
                if (player.getHealth() > 10 ) {
                    throw new MaxHealthException();
                }
            } catch (MaxHealthException e) {
                player.setHealth(10);
            }
        } else {
            try {
                if (player.getHealth() > 15 ) {
                    throw new MaxHealthException();
                }
            } catch (MaxHealthException e) {
                player.setHealth(15);
            }
        }
    }
}


