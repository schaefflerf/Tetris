package Board;

import Stones.StoneType;

public class Board {
    private final Board board;
    private int COL = 12;
    private int ROWS = 22;
    private String[][] field = new String[ROWS][COL];
    private String emptyField = ".";
    private String wall = "W";

    public Board(){
        this.board = this;
        fillField();
        printField();
    }

    //Setting start positioning for the new coming Stone
    public void spawnStone(StoneType stoneType){
        //TODO:
    }

    public void fillField(){
        for(int row = 0; row < ROWS; row++){
            field[row][0] = wall;
            field[row][COL-1] = wall;
        }
        for(int col = 0; col < COL; col++){
            field[0][col] = wall;
            field[ROWS-1][col] = wall;
        }

        for(int i = 1; i < ROWS-1; i++){
            for (int j = 1; j < COL-1; j++){
                field[i][j] = emptyField;
            }
        }
    }
    public void printField(){
        for(int i = 0; i < ROWS; i++){
            for (int j = 0; j < COL; j++){
                System.out.print(field[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public Board getBoard() {
        return board;
    }
}
