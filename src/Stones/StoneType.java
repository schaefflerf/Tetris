package Stones;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum StoneType {
    SmashBoy,
    RhodeIslandZ,
    ClevelandZ,
    Hero,
    OrangeRicky,
    BlueRicky,
    Teewee;

    //Pick random Stone from enum
    private static final List<StoneType> VALUES =
            List.of(values());
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static StoneType randomStone(){
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
