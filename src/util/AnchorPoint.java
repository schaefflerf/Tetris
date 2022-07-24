package util;

/**
 * The anchor point position describes the coordinate from which each stone is built
 * Each Movement depends from the anchor
 */
public class AnchorPoint {
    public static final AnchorPoint ZERO_ZERO = new AnchorPoint(0, 0);
    public static final AnchorPoint RIGHT = new AnchorPoint(1, 0);
    public static final AnchorPoint LEFT = new AnchorPoint(-1, 0);

    private final int x;

    private final int y;

    public AnchorPoint(int posX, int posY){
        this.x = posX;
        this.y = posY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
