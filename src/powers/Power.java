/**
 * Package reprentant les pouvoirs
 */
package powers;

/**
 * Classe parent de tous les pouvoirs présent dans le jeu.
 */
abstract public class Power {


    /**
     * Attribut des pouvoir
     */
    private String powerName;
    private int powerStrength;


    /**
     *
     * @param name
     * @param strength
     */
    public Power(String name, int strength){
        this.powerName = name;
        this.powerStrength = strength;
    }

    /**
     *
     * @return phrase du pouvoir
     */
    @Override
    public String toString() {
        return "POUVOIR DE MAGICIEN ->  " + powerName +
                ", FORCE = +" + powerStrength;
    }


    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName;
    }

    public int getPowerStrength() {
        return powerStrength;
    }

    public void setPowerStrength(int powerStrength) {
        this.powerStrength = powerStrength;
    }
}