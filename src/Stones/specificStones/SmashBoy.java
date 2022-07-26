package Stones.specificStones;

import Stones.Stone;
import Stones.StoneType;

public class SmashBoy extends Stone {
    public String[][] getStonePattern() {
        return stonePattern;
    }

    private final String[][] stonePattern = new String[12][22]; //TODO: Change it with COL and ROWS
    public SmashBoy() {
        super(StoneType.SmashBoy);
    }

    @Override
    public void spawnStone() {
        stonePattern[1][5] = "S";
        stonePattern[1][6] = "S";
        stonePattern[2][5] = "S";
        stonePattern[2][6] = "S";
    }

    @Override
    public void falling() {

    }

    @Override
    public void rotate() {

    }

}
