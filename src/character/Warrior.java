package character;

public class Warrior {
	
	//attributes
	private String name = "default";
	private int health = 5;
	private int strength = 5;
	private String img = "url";
	
	public Warrior() {
		
	}
	
	public Warrior(String name) {
	
	}
	
	public Warrior(String name, String img, int health, int strength) {
		this.name = name;
		this.img = img;
		this.health = health;
		this.strength = strength;
	}
	
	
	//GETTER
	
	public String getName() {
		return name;
	}
	
	public int getHealth() {
		return health;
	}
	
	public int getStrength() {
		return strength;
	}
	
	public String getImage() {
		return img;
	}
	
	
	//SETTER
	
	public void setName(String a) {
		name = a;
	}
	
	public void setHealth(int a) {
		health = a;
	}
	
	public void setName(int a) {
		strength = a;
	}
	
	public void setImage(String a) {
		img = a;
	}
}
