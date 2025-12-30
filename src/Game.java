package src;

import java.util.ArrayList;

public class Game {
    public static void main(String[] args) {
        
        GameCanvas gameCanvas = new GameCanvas();
        
        final double fps = 60.0;
        final double secondsPerFrame = 1_000_000_000.0 / fps;
        double now = System.nanoTime();
        double lastFrame = System.nanoTime();
        double delta = 0;

        //Make all objects here
        World world = new World();
        ArrayList<GameObject> objectsList = world.createList();

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
