package src;

import java.util.List;

public class Game {
    public static void main(String[] args) {

        GameCanvas gameCanvas = new GameCanvas();
        World world = new World();
        KeyHandler keyHandler = new KeyHandler(world, 3);

        gameCanvas.addKeyListener(keyHandler);
        gameCanvas.requestFocus();
        
        final double fps = 60.0;
        final double secondsPerFrame = 1_000_000_000.0 / fps;
        double now = System.nanoTime();
        double lastFrame = System.nanoTime();
        double delta = 0;

        // Make all objects here
        List<GameObject> objectsList = world.createList();
        //Makes sure that the game renders the the same amount every frame
        while (true) {


            now = System.nanoTime();
            delta = now - lastFrame;
            if (delta > secondsPerFrame) {
                gameCanvas.render(objectsList);
                lastFrame = now;
            }

        }

    }

}
