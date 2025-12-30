package src;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;

import javax.swing.JFrame;

public class GameCanvas extends Canvas {
    private BufferStrategy bufferStrategy = null;


    public GameCanvas() {
        JFrame jframe = new JFrame("Potato Panic");


        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jframe.setLocationRelativeTo(null);

        jframe.add(this);

        this.setIgnoreRepaint(true);
        jframe.setVisible(true);

    }

    public void render(ArrayList<GameObject> objectsList) {

        if (bufferStrategy == null) {
            createBufferStrategy(1);
            bufferStrategy = getBufferStrategy();
        }

       Graphics graphics = bufferStrategy.getDrawGraphics();

        do {

            graphics.setColor(new Color(255, 255, 255));
            graphics.fillRect(0, 0, 2000, 2000);

            // Draws objects
            for (int i = 0; i < objectsList.size() ;i++)
            {
                GameObject gameObject = objectsList.get(i);
                gameObject.draw(graphics);
                
            }
            
            bufferStrategy.show();

        } while (bufferStrategy.contentsRestored() || bufferStrategy.contentsLost());
        graphics.dispose();
        
    }
}