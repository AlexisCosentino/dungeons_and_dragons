package character;

public class Wizard extends Character {
	String powerName = "";
	int powerStrength = 0;



	
	public Wizard(String name) {
		super(name, 3, 8);
	}
	
	
	//GETTER
	public String getPowerName() {
		return powerName;
	}
	
	public int getPowerStrength() {
		return powerStrength;
	}
	
	
	//SETTER
	
	public void setPowerName(String a) {
		powerName = a;
	}
	
	public void setPowerStrength(int a) {
		powerStrength = a;
	}
	

}
