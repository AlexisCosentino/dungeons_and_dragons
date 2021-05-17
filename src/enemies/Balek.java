package enemies;

/**
 * Classe enfant de l'enemie de type boss avec 30 point de vie et 5 points d'attaque.
 */
public class Balek extends Enemies{

    /**
     * Constructeur du boss avec les attributs du parent en parametre
     */
    public Balek() {
        super("BALEK 'The Black Destroyer'", 30, 5);
    }

    /**
     *
     * @return phrase
     */
    public String toString(){
        return getName() + " ->  VIE : " + getHealth() + ", FORCE : " + getStrength();
    }

    /**
     *
     * @return phrase balek est mort
     */
    public String balekIsDead(){
        return getName() + " est mort !! Tu es arrivé au bout du jeu ! Félicitation gamin !!";
    }

}
