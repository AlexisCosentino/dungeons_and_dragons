package game;

import java.util.Scanner;
import character.Character;


/**
 * Voici la classe shop qui permet d'acceder a la boutique et qui permet d'acheter des améliorations pour le personnage.
 */
public class Shop {


    /**
     *  Attribut dont la boutique aura besoin, dont le personnage pour voir l'argent qu'il possède et lui attribuer des améliorations
     */
    private Character player;
    private Scanner in;

    /**
     * Constructeur de la boutique avec le peronnage en parametre
     * @param player
     */
    public Shop(Character player ){
        this.player = player;
        this.in =  new Scanner(System.in);

    }

    /**
     * Méthode principale de la boutique qui permet d'acceder à la boutque et y faire des achats
     */
        public void buy(){
        System.out.println();
        System.out.println("  |----------------------------------------------| ");
        System.out.println("                SHOP      J'ai "+player.getWallet()+"元       ");
        System.out.println("      " + player.toString());
        System.out.println("  |----------------------------------------------|");
        System.out.println("1. MINI BURGER 		->     	VIE +2        10 元");
        System.out.println("2. CHEESEBURGER 	->     	VIE +4        15 元");
        System.out.println("3. CAFE      		->   	FORCE +2      10 元");
        System.out.println("4. COCAINE      	->   	FORCE +4      15 元");
        System.out.println("5. JOLI DESSIN     	->   	               2 元");
        System.out.println("6. EXIT");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                if (player.getWallet() >= 10) {
                    player.setWallet(player.getWallet() - 10);
                    player.setHealth(player.getHealth() + 2);
                    System.out.println("Miam miam, je kiffe !");
                } else {
                    System.out.println("Pas assez d'argent débile");
                }
                buy();
                break;
            case 2:
                if (player.getWallet() >= 15) {
                    player.setWallet(player.getWallet() - 15);
                    player.setHealth(player.getHealth() + 4);
                    System.out.println("Miam miam, putain comme c'est bon !");

                } else {
                    System.out.println("Pas assez d'argent débile");
                }
                buy();
                break;
            case 3:
                if (player.getWallet() >= 10) {
                    player.setWallet(player.getWallet() - 10);
                    player.setStrength(player.getStrength() + 2);
                    System.out.println("Slurp, ca va mieux !");

                } else {
                    System.out.println("Pas assez d'argent débile");
                }
                buy();
                break;
            case 4:
                if (player.getWallet() >= 15) {
                    player.setWallet(player.getWallet() - 15);
                    player.setStrength(player.getStrength() + 4);
                    System.out.println("SNIIIIIIF, wouah putain je suis chaud !");
                } else {
                    System.out.println("Pas assez d'argent débile");
                }
                buy();
                break;
            case 5:
                System.out.println();
                System.out.println("          ___   ____");
                System.out.println("        /' --;^/ ,-_\\     \\ | /");
                System.out.println("       / / --o\\ o-\\ \\\\   --(_)--           I want spend my life with you " + player.getName());
                System.out.println("      /-/-/|o|-|\\-\\\\|\\\\   / | \\");
                System.out.println("       '`  ` |-|   `` '                             $$$   $$$");
                System.out.println("             |-|                                   $$$$$ $$$$$");
                System.out.println("             |-|O                                  $$$$$$$$$$$");
                System.out.println("             |-(\\,__                                 $$$$$$$");
                System.out.println("          ...|-|\\--,\\_....                             $$$");
                System.out.println("      ,;;;;;;;;;;;;;;;;;;;;;;;;,.                       $");
                System.out.println("    ,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;,.");
                System.out.println("~~,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;,~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("~;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;,  ______   ---------   _____     ------\n");
                System.out.println();
                buy();
                break;
            case 6:
                break;
            default:
                System.out.println("Choix non valide");
                buy();
        }
    }
}
