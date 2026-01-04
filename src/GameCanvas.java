package src;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.util.List;

import javax.swing.JFrame;

import org.dyn4j.geometry.Vector2;
import org.dyn4j.world.World;

import src.Objects.GameObject;

import org.dyn4j.dynamics.*;


public class GameCanvas extends Canvas {

    private BufferStrategy bufferStrategy = null;

    World<Body> world;

    public GameCanvas() {
        
        JFrame jframe = new JFrame("Potato Panic");

        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jframe.setLocationRelativeTo(null);
        
        jframe.add(this);
        
        this.setIgnoreRepaint(true);

        jframe.setVisible(true);
        

        this.requestFocus();

    }

    public void render(List<GameObject> objects) {

        objects.sort((object1, object2) -> object1.getDepth() - object2.getDepth());

        if (bufferStrategy == null) {
            createBufferStrategy(1);
            bufferStrategy = getBufferStrategy();
        }

        Graphics graphics = bufferStrategy.getDrawGraphics();

        do {

            graphics.setColor(new Color(255, 255, 255));
            graphics.fillRect(0, 0, 2000, 2000);

            // Draws objects
            for (GameObject gameObject : objects) {
                gameObject.draw(graphics);
            }
            
            bufferStrategy.show();

        } while (bufferStrategy.contentsRestored() || bufferStrategy.contentsLost());
        graphics.dispose();

    }
}