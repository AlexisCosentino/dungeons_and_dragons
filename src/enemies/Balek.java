package enemies;


public class Balek extends Enemies{
    private int strength;

    public Balek() {
        super("BALEK 'The Black Destroyer'", 30, 5);
    }

    public String toString(){
        return getName() + " ->  VIE : " + getHealth() + ", FORCE : " + getStrength();
    }

    public String balekIsDead(){
        return getName() + " est mort !! Tu es arrivé au bout du jeu ! Félicitation gamin !!";
    }

}
