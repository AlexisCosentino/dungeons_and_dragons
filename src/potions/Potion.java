package potions;

public abstract class Potion {
    private String name;
    private int strength;

    public Potion(String name, int strength){
        this.name = name;
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Vous êtes tombé sur : " + name +
                ", Force =" + strength;
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
