package game;

import java.util.Scanner;
import character.Character;

public class Shop {
    Character player;
    private Scanner in = new Scanner(System.in);

    public Shop(Menu menu){
        this.player = menu.getPlayer();

    }

    public void goToShop() {
        if (player.getWallet() >= 10) {
            System.out.println("Passer a la boutique avant de jouer ?");
            System.out.println("1 -> oui      2 -> Non");

            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    buy();
                    break;
                case 2:
                    break;
            }
        }
    }
        public void buy(){
        System.out.println("Mon porte monnaie -> " + player.getWallet());
        System.out.println("1. MINI BURGER 		->     	VIE +2 = 10 Rials");
        System.out.println("2. CHEESEBURGER 	->     	VIE +4 = 15 Rials");
        System.out.println("3. CAFE      		->   	FORCE +2 = 10 Rials");
        System.out.println("4. COCAINE      	->   	FORCE +4 = 15 Rials");
        System.out.println("5. EXIT");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                if (player.getWallet() >= 10) {
                    player.setWallet(player.getWallet() - 10);
                    player.setHealth(player.getHealth() + 2);
                } else {
                    System.out.println("Pas assez d'argent débile");
                }
                break;
            case 2:
                if (player.getWallet() >= 15) {
                    player.setWallet(player.getWallet() - 15);
                    player.setHealth(player.getHealth() + 4);
                } else {
                    System.out.println("Pas assez d'argent débile");
                }
                break;
            case 3:
                if (player.getWallet() >= 10) {
                    player.setWallet(player.getWallet() - 10);
                    player.setStrength(player.getStrength() + 2);
                } else {
                    System.out.println("Pas assez d'argent débile");
                }
                break;
            case 4:
                if (player.getWallet() >= 15) {
                    player.setWallet(player.getWallet() - 15);
                    player.setStrength(player.getStrength() + 4);
                } else {
                    System.out.println("Pas assez d'argent débile");
                }
                break;
            case 5:
                break;
            default:
                System.out.println("Choix non valide");
                buy();
        }
    }
}
