package cases;

import character.Character;

import java.util.concurrent.ThreadLocalRandom;

public class MoneyCase extends Case{
    private String sentence;
    private int money;

    public MoneyCase(){
        this.sentence = "MONEY MONEY !!";
        this.money = moneyGenerate();
    }

    @Override
    public void interaction(Character player) {
        player.setWallet(player.getWallet() + money);
    }

    @Override
    public String toString() {
        return sentence + " Vous avez gagné " + money + " 元";
    }

    public int moneyGenerate(){
        int money = ThreadLocalRandom.current().nextInt(5, 10 + 1);
        return money;
    }
}
