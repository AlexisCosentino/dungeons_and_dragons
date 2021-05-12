package cases;


import game.Board;
import character.Character;

/**
 * Classe parent de toutes les cases du plateau de jeu
 */
public abstract class Case {

    /**
     * Attribut des cases
     */
    private String sentence;


    /**
     * Conqtructeur de case
     * @param sentence
     */
    public Case(String sentence){
        this.sentence = sentence;

    }

    public String toString() {
        return sentence;
    }



    /**
     * @param : abstraite qui permet de faire une intéraction spécifique en fonction du type de case
     */
    public abstract void interaction(Character player, Board board);

}
