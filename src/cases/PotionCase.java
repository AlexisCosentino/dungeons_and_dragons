package cases;

import potions.Potion;

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
}