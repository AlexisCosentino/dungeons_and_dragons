package cases;

public class EmptyCase extends Case {
    private String sentence = "Vous êtes tombé sur une case vide, ouf !";

    public EmptyCase(){
        this.sentence = "Vous êtes tombé sur une case vide, ouf !";
    }

    @Override
    public String toString() {
        return sentence;
    }
}
