package Game;

/**
 * GameLoop, Pause, Start....
 */
public class Game {
    public static final int FPS = 1;
    public static final int DELAY_MULTIPLIER = FPS * 1000;
    public static boolean PAUSE_MODE = false;
    public static boolean RESET = false;


    public void run() {
        while (!RESET) {
            if(!PAUSE_MODE){
                update();
                sleep();
            }else{
                processInput();
            }
        }
    }
    private void sleep(){
            try {
                Thread.sleep(DELAY_MULTIPLIER);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }

    private void processInput() {
    }

    private void update() {
        //TODO: Falling method


    }
}
