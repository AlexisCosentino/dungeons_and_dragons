package cases;

import character.Character;
import game.Board;

public class EmptyCase extends Case {

    public EmptyCase(){
        super("Il n'y a rien a craindre par ici....");
    }

    @Override
    public void interaction(Character player, Board board) {
    }

}
