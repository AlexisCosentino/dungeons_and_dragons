package cases;

import character.Character;
import enemies.Balek;
import enemies.Enemies;
import game.Board;
import java.util.Scanner;

public class BalekCase extends Case{
    private Enemies balek;
    private Scanner in;


    public BalekCase(Enemies enemies){
        super("Tu es arrivé au bout du jeu !!");
        this.in = new Scanner(System.in);
        this.balek = new Balek();
    }

    @Override
    public void interaction(Character player, Board board) {
        board.waitAndSee(500);
        System.out.println("B");
        board.waitAndSee(500);
        System.out.println("BOO");
        board.waitAndSee(500);
        System.out.println("BOOOO");
        board.waitAndSee(500);
        System.out.println("BOOOOOOOOM !!!");
        board.waitAndSee(500);
        System.out.println("Putain !! " + balek.getName() + " est la !!");
        System.out.println("Voici quelques 20 pieces d'or et va acheter ce dont tu as besoin pour lui nike sa race");
        player.setWallet(player.getWallet() + 20);
        board.waitAndSee(1500);
    }

    public void fightBalek(Character player, Balek balek){
        while (player.getHealth() > 0 && balek.getHealth() > 0) {
            if (player.getStrength() >= balek.getHealth()) {
                balek.setHealth(0);
                System.out.println();
                System.out.println(player.getName() + " -> a perdu 0 de vie");
                System.out.println(balek.getName() + " -> a perdu toute sa vie");
                System.out.println(balek.balekIsDead());
            } else {
                balek.setHealth(balek.getHealth() - player.getStrength());
                player.setHealth(player.getHealth() - balek.getStrength());
                System.out.println();
                System.out.println(player.getName() + " -> a perdu -" + balek.getStrength() + " de vie");
                System.out.println(balek.getName() + " -> a perdu -" + player.getStrength() + " de vie");
            }
            if ( balek.getHealth() > 0 ) {
                System.out.println();
                System.out.println(balek.toString());
                System.out.println(player.toString());
                System.out.println("-------------------------");                                                //Je propose de se battre encore ou de partir
                System.out.println("1 -> SE BATTRE");
                System.out.println("2 -> FUIR TEL UN LACHE");
                System.out.println("-------------------------");
                int choice = in.nextInt();
                switch (choice) {
                    case 1:
                        fightBalek(player, balek);                //Il se bat encore
                        break;
                    case 2:
                        System.out.println("Impossible de fuir mon gars, bagarre jusqu'à la mort !!");
                        fightBalek(player, balek);                //Il se bat encore
                        break;
                }
            }
        }
    }
}
