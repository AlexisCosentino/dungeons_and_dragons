package weapons;


/**
 * Classe parent de tous les pouvoirs présent dans le jeu.
 */
abstract public class Weapon {


    /**
     * Attribut des armes, nom et force
     */
    private String weaponName;
    private int weaponStrength;

    /**
     *
     * @param name
     * @param strength
     */
    public Weapon(String name, int strength){
        this.weaponName = name;
        this.weaponStrength = strength;
    }

    /**
     *
     * @return phrase
     */
    @Override
    public String toString() {
        return "ARME DE GUERRIER -> " + weaponName +
                ", FORCE = +" + weaponStrength;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getWeaponStrength() {
        return weaponStrength;
    }

    public void setWeaponStrength(int weaponStrength) {
        this.weaponStrength = weaponStrength;
    }
}
