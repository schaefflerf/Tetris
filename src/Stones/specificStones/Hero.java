package Stones.specificStones;

import Stones.Stone;
import Stones.StoneType;
import util.AnchorPoint;

public class Hero extends Stone {
    public Hero(AnchorPoint position) {
        super(StoneType.Hero, position);
    }

    @Override
    public void spawnStone(AnchorPoint anchorPoint) {

    }

    @Override
    public void falling() {

    }

    @Override
    public void rotate() {

    }
}
