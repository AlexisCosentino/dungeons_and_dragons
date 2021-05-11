package cases;

import enemies.Enemies;
import character.Character;
import game.Board;
import game.Dice;

import java.util.Scanner;


public class EnemiesCase extends Case  {
    private Enemies enemies;
    private String fightSentence;
    private Scanner in;
    private Dice dice;


    public EnemiesCase(Enemies enemies){
        super(enemies.toString());
        this.enemies = enemies;
        this.fightSentence = enemies.toStringFight();
        this.in = new Scanner(System.in);
        this.dice = new Dice();
    }



    @Override
    public void interaction(Character player, Board  board) {

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
        keepFighting(player, board);
    }

    public void keepFighting(Character player, Board board){
        int choice = 0;
        while (enemies.getHealth() > 0 && choice != 2 && player.getHealth() > 0) {		//Tant que l'énemie est tjr en vie, que je veux me battre et que j'ai de la vie
            System.out.println();
            System.out.println(enemies.toStringFight());					//J'annonce l'état de l'énemie
            System.out.println(player.toString());												//Etat du joueur
            System.out.println("-------------------------");												//Je propose de se battre encore ou de partir
            System.out.println("1 -> SE BATTRE");
            System.out.println("2 -> FUIR TEL UN LACHE");
            System.out.println("-------------------------");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    interaction(player, board);				//Il se bat encore
                    break;
                case 2:
                    int goBack = dice.play();
                    board.setIndexPlayer(board.getIndexPlayer() - goBack);			//il recule de quelques cases
                    break;
            }
        }
    }


    public Enemies getEnemies() {
        return enemies;
    }

    public void setEnemies(Enemies enemies) {
        this.enemies = enemies;
    }

}
