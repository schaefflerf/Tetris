package Stones;

import Board.Board;
import util.AnchorPoint;

public abstract class Stone implements StoneInterface{
    private static int idCount = 0;

    private final int ID;
    private final StoneType stoneType;
    private AnchorPoint anchorPoint;

    public Stone(StoneType stoneType, AnchorPoint position){
        this.stoneType = stoneType;
        this.ID = idCount;
        this.anchorPoint = position;
        idCount++;
        spawnStone(anchorPoint);
    }
    public abstract void spawnStone(AnchorPoint anchorPoint); //TODO:
    public abstract void falling();        //TODO:

    public abstract void rotate();         //TODO:

}
