package cases;

import character.Character;
import game.Board;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Classe enfant de case qui permet de generer de l'argent
 */
public class MoneyCase extends Case{

    /**
     * Attribut propre a cette case qui représente un entier
     */
    private int money;


    /**
     * constructeur de cette case argent
     */
    public MoneyCase(){
        super("\uD83D\uDCB0 MONEY MONEY !!");
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


    /**
     * Méthode qui permet de générer de l'argent random entrer 5 et 10
     * @return
     */
    public int moneyGenerate(){
        int money = ThreadLocalRandom.current().nextInt(5, 10 + 1);
        return money;
    }
}
