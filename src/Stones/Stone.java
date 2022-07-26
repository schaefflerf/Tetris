package Stones;

import util.RotationPoint;

public abstract class Stone implements StoneInterface{
    private static int idCount = 0;
    private final int ID;
    private final StoneType stoneType;
    private RotationPoint rotationPoint;

    public Stone(StoneType stoneType){
        this.stoneType = stoneType;
        this.ID = idCount;
        idCount++;
    }
    public abstract void spawnStone(); //TODO:

    public abstract void falling();        //TODO:

    public abstract void rotate();         //TODO:

}
