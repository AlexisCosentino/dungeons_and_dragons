package cases;

import enemies.Enemies;
import enemies.Gobelin;
import game.Menu;
import character.Character;

public abstract class Case {

    public Case(){

    }

    public abstract void interaction(Character player);
}
