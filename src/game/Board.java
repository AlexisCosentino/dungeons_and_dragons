package game;

import cases.EmptyCase;
import cases.EnemiesCase;
import cases.PotionCase;
import cases.WeaponsCase;
import enemies.Enemies;
import enemies.Gobelin;
import potions.Elixir;
import potions.Potion;
import weapons.Mace;
import weapons.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int nbCase = 0;
    private int[] board = new int[64];
    private List liste = new ArrayList();
    private Enemies gobelin = new Gobelin();
    private Weapon mace = new Mace();
    private Potion elixir = new Elixir();

    //arrraylist d'objet case depuis Board
    //constructeur de board avec un itnit de liste de case

    public Board(){
        liste.add( new EmptyCase());
        liste.add( new EmptyCase());
        liste.add(new EnemiesCase(gobelin));
        liste.add(new WeaponsCase(mace));
        liste.add(new PotionCase(elixir));
    }

    public List getListe() {
        return liste;
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

    public int[] getBoard() {

        return board;
    }

    public void setBoard(int[] board) {

        this.board = board;
    }
}
