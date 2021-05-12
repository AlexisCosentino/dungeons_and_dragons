package cases;

import character.Character;
import game.Board;

/**
 * Classe enfant de case, qui représente une case vide
 */
public class EmptyCase extends Case {

    /**
     * Constructeur de cette case vide
     */
    public EmptyCase(){
        super("Il n'y a rien a craindre par ici....");
    }

    @Override
    public void interaction(Character player, Board board) {
    }

}
