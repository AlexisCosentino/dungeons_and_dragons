package cases;

import game.Board;
import character.Character;

public abstract class Case {

    private String sentence;


    public String toString() {
        return sentence;
    }

    public Case(String sentence){
        this.sentence = sentence;

    }

    public abstract void interaction(Character player, Board board);
}
