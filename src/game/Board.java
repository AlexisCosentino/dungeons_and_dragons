package game;

public class Board {
    private int nbCase = 0;
    private int[] board = new int[63];

    public Board(){

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
