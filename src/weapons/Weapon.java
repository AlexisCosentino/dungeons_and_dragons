package weapons;

abstract public class Weapon {
    private String weaponName = "vide";
    private int weaponStrength = 0;

    public Weapon(String name, int strength){
        this.weaponName = name;
        this.weaponStrength = strength;
    }

    @Override
    public String toString() {
        return "Vous êtes tombé sur : " + weaponName +
                ", Force =" + weaponStrength;
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
