package cases;

import character.Character;

public class EmptyCase extends Case {
    private String sentence;

    public EmptyCase(){
        this.sentence = "Il n'y a rien a craindre par ici....";
    }

    @Override
    public void interaction(Character player) {
    }

    @Override
    public String toString() {
        return sentence;
    }
}
