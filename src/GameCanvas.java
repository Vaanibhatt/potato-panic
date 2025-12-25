package src;

import java.awt.*;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

public class GameCanvas extends Canvas {
    private BufferStrategy bufferStrategy = null;

    private int x = 0;
    private int y = 0;
    private int speed = 5;

    public GameCanvas() {
        JFrame jframe = new JFrame("Potato Panic");

        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jframe.setLocationRelativeTo(null);

        jframe.add(this);

        this.setIgnoreRepaint(true);
        jframe.setVisible(true);

    }

    public void render() {

        if (bufferStrategy == null) {
            createBufferStrategy(1);
            bufferStrategy = getBufferStrategy();
        }

       Graphics graphics = bufferStrategy.getDrawGraphics();
        do {

            graphics.setColor(new Color(255, 255, 255));
            graphics.fillRect(0, 0, 2000, 2000);

            // Draw circle
            graphics.setColor(Color.RED);
            graphics.fillOval(x, y, 50, 50);

            // Remove this test later
            x += speed;
            y += speed;

            bufferStrategy.show();

        } while (bufferStrategy.contentsRestored() || bufferStrategy.contentsLost());
        graphics.dispose();
        
    }
}