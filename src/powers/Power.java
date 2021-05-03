package powers;

abstract public class Power {
    private String powerName = "vide";
    private int powerStrength = 0;

    public Power(String name, int strength){
        this.powerName = name;
        this.powerStrength = strength;
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