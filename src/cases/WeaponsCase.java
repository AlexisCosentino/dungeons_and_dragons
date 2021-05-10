package cases;

import character.*;
import character.Character;
import exceptions.MaxStrengthException;
import game.Board;
import weapons.Weapon;

import java.util.Scanner;

public class WeaponsCase extends Case  {
    private Weapon weapon;
    private Scanner in;

    public WeaponsCase(Weapon weapon){
        super(weapon.toString());
        this.weapon = weapon;
        this.in = new Scanner(System.in);
    }


    @Override
    public void interaction(Character player, Board board) {
        if (player instanceof Warrior){

            if (player.getLeftHand() == null) {
                ((Warrior) player).setWeapon(weapon);
                player.setStrength(player.getStrength() + weapon.getWeaponStrength());
            } else if (player.getLeftHand() != weapon.getWeaponName()){
                System.out.println("Souhaitez vous changer d'arme ?");
                System.out.println("1. Yes      2. Non");
                int choice = in.nextInt();
                switch (choice){
                    case 1 :
                        ((Warrior) player).setWeapon(weapon);
                        player.setStrength(5 + weapon.getWeaponStrength());
                        break;
                    case 2 :
                        break;
                }

            }

            //// EXCEPTION FOR MAX STRENGTH /////////////////// EVEN ITS NOT REALLY POSSIBLE WITHOUT CHEAT

            try {
                if (player.getStrength() > 10 ) {
                    throw new MaxStrengthException();
                }
            } catch (MaxStrengthException e) {
                player.setStrength(10);
            }
        } else if (player instanceof Jcvd){
            System.out.println("==> JCVD pense que les armes c'est pour les faibles");
        } else {
            System.out.println("==> Un Magicien n'accepte pas des armes de PD");
        }


    }

}
