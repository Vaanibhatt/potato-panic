package src;

import java.util.List;

import org.dyn4j.dynamics.Body;
import org.dyn4j.dynamics.BodyFixture;
import org.dyn4j.dynamics.Settings;
import org.dyn4j.world.BroadphaseCollisionData;
import org.dyn4j.world.ManifoldCollisionData;
import org.dyn4j.world.NarrowphaseCollisionData;
import org.dyn4j.world.World;
import org.dyn4j.world.listener.CollisionListener;

import src.Objects.GameObject;

public class Game {
    private static final double FPS = 120.0;
    private static final double BILLION = 1_000_000_000.0;
    private static final double SECOND_PER_FRAME = BILLION / FPS;

    public static void main(String[] args) {

        GameCanvas gameCanvas = new GameCanvas();
        Enviroment enviroment = new Enviroment();
        KeyHandler keyHandler = new KeyHandler(enviroment, 3);
        gameCanvas.addKeyListener(keyHandler);



        double now = System.nanoTime();
        double lastFrame = System.nanoTime();
        double delta = 0;

        // Make all objects here
        List<GameObject> objects = enviroment.getObjects();
        // Makes sure that the game renders the the same amount every frame
        while (true) {

            now = System.nanoTime();
            delta = now - lastFrame;
            
            if (delta > SECOND_PER_FRAME) {

                enviroment.world.update(delta/BILLION);
                for (GameObject gameObject : objects) {
                    gameObject.update();
                }
                
                gameCanvas.render(objects);
                
                lastFrame = now;


            }

        }
    }
}
