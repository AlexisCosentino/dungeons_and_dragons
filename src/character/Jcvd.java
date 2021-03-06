package character;

import powers.Power;


/**
 * Classe enfant de personnage qui représente Jean Claude Van Damme et qui accepte des pouvoirs, 6 de vie et 6 de force.
 */
public class Jcvd extends Character{


    /**
     * attribut propre à jcvd de type objet pouvoir
     */
    private Power power;

    /**
     * Constructeur avec les parametres du parent
     */
    public Jcvd(){
        super("Jean Claude Van Damme", 6, 6, 6, "JCVD");
        this.power = null;
    }

    /**
     * Constructeur avec les parametres du parent
     */
    public Jcvd(String name, Power power){
        super(name, 6,6, 5, "JCVD");
        this.power = power;
    }

    @Override
    public String getLeftHand() {

        if (power != null){
            return power.getPowerName();
        } else {
            return "<jadore lo dan 20 30 an yen aura plu>";
        }
    }

    public void setPower(Power power) {
        this.power = power;
    }

}
