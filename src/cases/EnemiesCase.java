package cases;

import enemies.Enemies;
import character.Character;

import java.util.Scanner;


public class EnemiesCase extends Case  {
    private Enemies enemies;
    private String sentence;
    private String fightSentence;
    private Scanner in;


    public EnemiesCase(Enemies enemies){
        this.enemies = enemies;
        this.sentence = enemies.toString();
        this.fightSentence = enemies.toStringFight();
        this.in = new Scanner(System.in);
    }

    @Override
    public String toString() {
        return sentence;
    }


    @Override
    public void interaction(Character player) {
        if (player.getStrength() >= enemies.getHealth()){
            enemies.setHealth(0);
            System.out.println();
            System.out.println(player.getName() + " -> a perdu 0 de vie");
            System.out.println(enemies.getName() + " -> a perdu toute sa vie");
            System.out.println("Le " + enemies.getName() + " est MORT.");
        } else {
            enemies.setHealth(enemies.getHealth() - player.getStrength());
            player.setHealth(player.getHealth() - enemies.getStrength());
            System.out.println();
            System.out.println(player.getName() + " -> a perdu -" +enemies.getStrength()+" de vie");
            System.out.println(enemies.getName() + " -> a perdu -" + player.getStrength() + " de vie");
        }
    }



    public Enemies getEnemies() {
        return enemies;
    }

    public void setEnemies(Enemies enemies) {
        this.enemies = enemies;
    }

}
