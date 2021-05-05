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


    //arrraylist d'objet case depuis Board
    //constructeur de board avec un itnit de liste de case

    public Board(){
        liste.add( new EmptyCase());
        liste.add( new PowerCase(light));      //1
        liste.add(new WeaponsCase(mace));         //2
        liste.add(new EnemiesCase(gobelin));     //3
        liste.add( new PowerCase(light));      //4
        liste.add(new WeaponsCase(mace));          //5
        liste.add(new EnemiesCase(gobelin));      //6
        liste.add(new PotionCase(elixir));      //7
        liste.add( new PowerCase(light));      //8
        liste.add(new EnemiesCase(gobelin));      //9
        liste.add(new EnemiesCase(sorcier));      //10
        liste.add(new WeaponsCase(mace));       //11
        liste.add(new EnemiesCase(gobelin));      //12
        liste.add(new PotionCase(elixir));      //13
        liste.add( new EmptyCase());              //14
        liste.add(new EnemiesCase(gobelin));      //15
        liste.add( new EmptyCase());            //16
        liste.add( new PowerCase(light));      //17
        liste.add(new EnemiesCase(gobelin));      //18
        liste.add(new WeaponsCase(sword));      //19
        liste.add(new EnemiesCase(sorcier));      //20
        liste.add(new EnemiesCase(gobelin));      //21
        liste.add(new WeaponsCase(mace));          //22
        liste.add( new PowerCase(light));      //23
        liste.add(new EnemiesCase(gobelin));      //24
        liste.add(new EnemiesCase(sorcier));      //25
        liste.add(new WeaponsCase(sword));      //26
        liste.add(new EnemiesCase(gobelin));     //27
        liste.add(new PotionCase(bigElixir));      //28
        liste.add( new EmptyCase());            //29
        liste.add(new EnemiesCase(gobelin));     //30
        liste.add(new PotionCase(elixir));      //31
        liste.add(new EnemiesCase(sorcier));      //32
        liste.add(new PotionCase(elixir));      //33
        liste.add( new EmptyCase());              //34
        liste.add(new EnemiesCase(sorcier));      //35
        liste.add(new EnemiesCase(sorcier));      //36
        liste.add(new EnemiesCase(sorcier));      //37
        liste.add(new WeaponsCase(mace));       //38
        liste.add(new PotionCase(elixir));      //39
        liste.add(new EnemiesCase(sorcier));      //40
        liste.add(new PotionCase(bigElixir));      //41
        liste.add(new WeaponsCase(sword));      //42
        liste.add(new PotionCase(elixir));      //43
        liste.add(new EnemiesCase(sorcier));      //44
        liste.add(new EnemiesCase(dragon));      //45
        liste.add( new EmptyCase());           //46
        liste.add(new EnemiesCase(sorcier));      //47
        liste.add(new PowerCase(fire));      //48
        liste.add(new PowerCase(fire));      //49
        liste.add( new EmptyCase());           //50
        liste.add( new EmptyCase());           //51
        liste.add(new EnemiesCase(dragon));      //52
        liste.add(new WeaponsCase(sword));      //53
        liste.add( new EmptyCase());             //54
        liste.add( new EmptyCase());              //55
        liste.add(new EnemiesCase(dragon));      //56
        liste.add( new EmptyCase());             //57
        liste.add( new EmptyCase());              //58
        liste.add( new EmptyCase());            //59
        liste.add( new EmptyCase());             //60
        liste.add( new EmptyCase());             //61
        liste.add(new EnemiesCase(dragon));      //62
        liste.add( new EmptyCase());             //63
    }


    public static void shuffle(List<Case> list){

    };


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
