package cases;

import enemies.Enemies;

public class EnemiesCase  extends Case  {
    private Enemies enemies;
    private String sentence;

    public EnemiesCase(Enemies enemies){
        this.enemies = enemies;
        this.sentence = enemies.toString();
    }

    @Override
    public String toString() {
        return sentence;
    }
}
