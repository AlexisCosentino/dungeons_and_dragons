package potions;

public class Elixir {
		private String name = "Potion de vie standard";
		private int strength = 2;
		
		
		public Elixir(String name, int strength) {
			this.name = name;
			this.strength = strength;
		}


		
		/////GETTER
		public String getName() {
			return name;
		}
		
		public int getStrength() {
			return strength;
		}


		
		//////SETTER
		public void setName(String name) {
			this.name = name;
		}


		public void setStrength(int strength) {
			this.strength = strength;
		}
		
		
}
