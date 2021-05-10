package cases;

import character.Character;
import game.Board;

import java.util.concurrent.ThreadLocalRandom;

public class MoneyCase extends Case{
    private int money;

    public MoneyCase(){
        super("MONEY MONEY !!");
        this.money = moneyGenerate();
    }

    @Override
    public void interaction(Character player, Board board) {
        player.setWallet(player.getWallet() + money);
    }

    @Override
    public String toString() {
        return super.toString() + " Vous avez gagné " + money + " 元";
    }

    public int moneyGenerate(){
        int money = ThreadLocalRandom.current().nextInt(5, 10 + 1);
        return money;
    }
}
