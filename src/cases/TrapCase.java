package cases;

import character.Character;
import game.Board;

import java.util.concurrent.ThreadLocalRandom;

public class TrapCase extends Case{
    int strength;

    public TrapCase() {
        super(" ARrGHh c'est un piège !");
        this.strength = trapStrength();
    }

    @Override
    public void interaction(Character player, Board board) {
    player.setHealth(player.getHealth() - strength);

    }

    @Override
    public String toString() {
        return super.toString() + " Vous avez perdu -" + strength + " de vie...";
    }

    public int trapStrength(){
        int strength = ThreadLocalRandom.current().nextInt(1, 3 + 1);
        return strength;
    }
}
