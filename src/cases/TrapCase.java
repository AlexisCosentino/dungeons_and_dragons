package cases;

import character.Character;
import game.Board;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Classe enfant de case qui représente une case piège ou l'on perd automatiquement de la vie
 */
public class TrapCase extends Case{

    /**
     * Attribut propre a cette case qui représente la force du piege
     */
    int strength;


    /**
     * Constructeur du piege
     */
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

    /**
     * Méthode qui permet de retourner une valeur random entre 1 et 3 pour la force du piege
     * @return
     */
    public int trapStrength(){
        int strength = ThreadLocalRandom.current().nextInt(1, 3 + 1);
        return strength;
    }
}
