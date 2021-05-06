package weapons;

abstract public class Weapon {
    private String weaponName;
    private int weaponStrength;

    public Weapon(String name, int strength){
        this.weaponName = name;
        this.weaponStrength = strength;
    }

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
