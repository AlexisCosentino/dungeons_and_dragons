package game;

import cases.*;
import enemies.*;
import potions.*;
import powers.*;
import weapons.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe qui représente le plateau de jeu. Il aura besoin des case pour ajouter sur le plateau
 */
public class Board {


    /**
     * Attribut dont le plateau aura besoin. tout le objets qui sont présent dans les case pour les instancier en tant que parametre,
     * l'index du joueur sur le plateau et une liste qui regroupe l'ensemble des case créé.
     */
    private int indexPlayer = 0;
    private List<Case> liste = new ArrayList<Case>();

    private Case balekCase;


    /**
     * Constructeur du board qui assigne chaque attribut à lur objet et ensuite instancie des case du tableau avec leur objet à l'intérieur.
     */
    public Board(){

        this.balekCase = new BalekCase(new Balek());

        for (int i=0; i<4; i++ ){
            liste.add(new EnemiesCase(new Dragon()));
        }
        for (int i=0; i<10; i++){
            liste.add(new EnemiesCase(new Sorcier()));
        }
        for (int i=0; i<10; i++){
            liste.add(new EnemiesCase(new Gobelin()));
        }
        for (int i=0; i<5; i++){
            liste.add(new WeaponsCase(new Mace()));
        }
        for (int i=0; i<4; i++){
            liste.add(new WeaponsCase(new Sword()));
        }
        for (int i=0; i<5; i++){
            liste.add(new PowerCase(new Storm()));;
        }
        for (int i=0; i<2; i++){
            liste.add(new PowerCase(new Fire()));;
        }
        for (int i=0; i<6; i++) {
            liste.add(new PotionCase(new Elixir()));
        }
        for (int i=0; i<2; i++) {
            liste.add(new PotionCase(new BigElixir()));
        }
        for (int i=0; i<16; i++) {
            liste.add(new EmptyCase());
        }
        for (int i=0; i<11; i++){
            liste.add(new MoneyCase());
        }
        for (int i=0; i<5; i++){
            liste.add(new TrapCase());
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
