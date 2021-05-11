package game;

import cases.*;
import enemies.*;
import potions.*;
import powers.*;
import weapons.*;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int indexPlayer = 0;
    private List<Case> liste = new ArrayList<Case>();
    private Enemies gobelin;
    private Enemies sorcier;
    private Enemies dragon;
    private Weapon mace;
    private Potion elixir;
    private Weapon sword;
    private Potion bigElixir;
    private Power light;
    private Power fire;
    private Balek balek;
    private Case balekCase;



    public Board(){
        this.gobelin = new Gobelin();
        this.sorcier = new Sorcier();
        this.dragon = new Dragon();
        this.mace = new Mace();
        this.elixir = new Elixir();
        this.sword = new Sword();
        this.bigElixir = new BigElixir();
        this.light = new Storm();
        this.fire = new Fire();
        this.balek = new Balek();
        this.balekCase = new BalekCase(balek);

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
        for (int i=0; i<11; i++){
            liste.add(new MoneyCase());
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

    public int getIndexPlayer() {

        return indexPlayer;
    }

    public Case getBalekCase() {
        return balekCase;
    }

    public void setIndexPlayer(int indexPlayer) {

        this.indexPlayer = indexPlayer;
    }

    public void waitAndSee(int time){
        try
        {
            Thread.sleep(time);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}
