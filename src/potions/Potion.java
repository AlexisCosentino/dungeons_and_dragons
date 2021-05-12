/**
 * Package representant les potions
 */
package potions;


/**
 * Classe parent des potions que l'on peut trouver dans le jeu.
 */
public abstract class Potion {


    /**
     * Attribut des potions
     */
    private String name;
    private int strength;


    /**
     *
     * @param name
     * @param strength
     */
    public Potion(String name, int strength){
        this.name = name;
        this.strength = strength;
    }

    /**
     *
     * @return phrase
     */
    @Override
    public String toString() {
        return "POTION :) ->  " + name +
                ", VIE = +" + strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }


}
