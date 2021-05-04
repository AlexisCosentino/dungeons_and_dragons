package cases;

import potions.Potion;
import character.Character;

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
    }
}
