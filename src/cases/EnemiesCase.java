package cases;

import enemies.Enemies;
import character.Character;

import java.util.Scanner;


public class EnemiesCase  extends Case  {
    private Enemies enemies;
    private String sentence;
    private String fightSentence;
    private Scanner in = new Scanner(System.in);


    public EnemiesCase(Enemies enemies){
        this.enemies = enemies;
        this.sentence = enemies.toString();
        this.fightSentence = enemies.toStringFight();
    }

    @Override
    public String toString() {
        return sentence;
    }


    @Override
    public void interaction(Character player) {
        if (player.getStrength() >= enemies.getHealth()){
            enemies.setHealth(0);
        } else {
            enemies.setHealth(enemies.getHealth() - player.getStrength());
            player.setHealth(player.getHealth() - enemies.getStrength());
        }
    }



    public Enemies getEnemies() {
        return enemies;
    }

    public void setEnemies(Enemies enemies) {
        this.enemies = enemies;
    }

}
