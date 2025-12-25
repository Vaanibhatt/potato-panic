package src;


import java.awt.*;
import java.awt.image.BufferStrategy;

public class GameCanvas extends Canvas  {

    private BufferStrategy bufferStrategy = null;

    private int x = 0;
    private int y = 0;
    private int speed = 5;

    public void render() {

        if (bufferStrategy == null)
        {
            createBufferStrategy(1);
            bufferStrategy = getBufferStrategy();
        }

        do {
            do {
                Graphics2D graphics = (Graphics2D) bufferStrategy.getDrawGraphics();
                graphics.clearRect(0, 0, 2000, 2000);

                // Draw circle
                graphics.setColor(Color.RED);
                graphics.fillOval(x, y, 50, 50);

                graphics.dispose();
                x += speed;
                y += speed;
            } while (bufferStrategy.contentsRestored());

            bufferStrategy.show();
            
        } while (bufferStrategy.contentsLost());
    }

}