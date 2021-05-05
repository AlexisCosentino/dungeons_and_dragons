package game;

import cases.*;
import enemies.*;
import potions.*;
import powers.*;
import weapons.*;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int nbCase = 0;
    private List<Case> liste = new ArrayList<Case>();
    private Enemies gobelin = new Gobelin();
    private Enemies sorcier = new Sorcier();
    private Enemies dragon = new Dragon();
    private Weapon mace = new Mace();
    private Potion elixir = new Elixir();
    private Weapon sword = new Sword();
    private Potion bigElixir = new BigElixir();
    private Power light = new Storm();
    private Power fire = new Fire();


    public Board(){
        for (int i=0; i<4; i++ ){
            liste.add(new EnemiesCase(dragon));
        }
        for (int i=0; i<10; i++){
            liste.add(new EnemiesCase(sorcier));
        }
        for (int i=0; i<10; i++){
            liste.add(new EnemiesCase(gobelin));
        }
        for (int i=0; i<5; i++){
            liste.add(new WeaponsCase(mace));
        }
        for (int i=0; i<4; i++){
            liste.add(new WeaponsCase(sword));
        }
        for (int i=0; i<5; i++){
            liste.add(new PowerCase(light));;
        }
        for (int i=0; i<2; i++){
            liste.add(new PowerCase(fire));;
        }
        for (int i=0; i<6; i++) {
            liste.add(new PotionCase(elixir));
        }
        for (int i=0; i<2; i++) {
            liste.add(new PotionCase(bigElixir));
        }
        for (int i=0; i<16; i++) {
            liste.add(new EmptyCase());
        }

    }


    public List<Case> getListe() {
        return liste;
    }

    public int getListeSize(){
        return liste.size();
    }

    public void setListe(List liste) {
        this.liste = liste;
    }

    public int getNbCase() {

        return nbCase;
    }

    public void setNbCase(int nbCase) {

        this.nbCase = nbCase;
    }

}
