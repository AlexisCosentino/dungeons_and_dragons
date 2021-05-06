package cases;

import character.Character;

import java.util.concurrent.ThreadLocalRandom;

public class MoneyCase extends Case{
    private String sentence;
    private int money = moneyGenerate();

    public MoneyCase(){
        this.sentence = "Vous avez gagné 5 Rials !!";
    }

    @Override
    public void interaction(Character player) {
        player.setWallet(player.getWallet() + money);
    }

    @Override
    public String toString() {
        return sentence;
    }

    public int moneyGenerate(){
        int money = ThreadLocalRandom.current().nextInt(5, 10 + 1);
        return money;
    }
}
