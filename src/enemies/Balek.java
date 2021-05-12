package enemies;

/**
 * Classe enfant de l'enemie
 */
public class Balek extends Enemies{

    /**
     * Constructeur du gobelin avec les attributs du parent en parametre
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
